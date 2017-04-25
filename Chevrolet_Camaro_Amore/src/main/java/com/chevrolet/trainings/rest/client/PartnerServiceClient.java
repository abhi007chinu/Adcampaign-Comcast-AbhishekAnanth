package com.chevrolet.trainings.rest.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.chevrolet.trainings.jaxrs.Partnerid;

//import com.chevrolet.trainings.jaxrs.Partnerid;

public class PartnerServiceClient 
{
	private static final String PARTNERID_SERVICE_URL ="http://localhost:8080/restws/services/partnerservice";
	
	public static void main(String[] args) 
	{
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(PARTNERID_SERVICE_URL).path("/partnerid").path("/{id})")
				.resolveTemplate("id", 123);
		Partnerid partnerid = target.request().get(Partnerid.class);
		System.out.println(partnerid.getName());
		
		WebTarget putTarget = client.target(PARTNERID_SERVICE_URL).path("/partnerids");
		
		partnerid.setName("Speranza Chevrolet Car Dealership");
		Response updateResponse = putTarget.request().put(Entity.entity(partnerid, MediaType.APPLICATION_XML));
		System.out.println(updateResponse.getStatus());
		updateResponse.close();
		
		Partnerid newPartnerid = new Partnerid();
		newPartnerid.setName("Verde Chevrolet Car Dealership");
		
		WebTarget postTarget = client.target(PARTNERID_SERVICE_URL).path("/partnerids");
		Partnerid postResponse = postTarget.request().post(Entity.entity(newPartnerid, MediaType.APPLICATION_XML),
				Partnerid.class);
		System.out.println(postResponse.getId());
		
		client.close();
	}
}

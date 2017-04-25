package com.chevrolet.trainings.jaxrs;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Produces({"application/xml","application/json"})
public interface PartnerService 
{
	@GET
	@Path("/partnerids/{id}")
	Partnerid getPartnerid(@PathParam("id") String id);

	@PUT
	@Path("/partnerids/")
	Response updatePartnerid(Partnerid partnerid);

	@POST
	@Path("/partnerids/")
	Response addPartnerid(Partnerid partnerid);

	@DELETE
	@Path("/partnerids/{id}")
	Response deletePartnerids(@PathParam("id")String id);
	
	@Path("/adcontent/{id}")
	Adcontent getAdcontent(@PathParam("id")String adcontentId);

}
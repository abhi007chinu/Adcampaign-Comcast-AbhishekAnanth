package com.chevrolet.trainings.jaxrs;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.core.Response;

public abstract class PartnerServiceImpl implements PartnerService {
	private long currentId = 123;
	Map<Long, Partnerid> partnerids = new HashMap<Long, Partnerid>();
	Map<Long, Adcontent> adcontents = new HashMap<Long, Adcontent>();

	public PartnerServiceImpl() {
		init();
	}

	final void init() {
		Partnerid partnerid = new Partnerid();
		partnerid.setName("John");
		partnerid.setId(currentId);
		partnerids.put(partnerid.getId(), partnerid);

		Adcontent adcontent = new Adcontent();
		adcontent.setDescription("New model!");
		adcontent.setId(223);
		adcontents.put(adcontent.getId(), adcontent);
	}

	public Response addPartnerid(Partnerid partnerid) 
	{
		System.out.println("...invoking addPartner, Partner Name is "+ partnerid.getName());
		partnerid.setId(++currentId);
		partnerids.put(partnerid.getId(), partnerid);
		return Response.ok(partnerid).build();
	}

	public Partnerid getPartnerid(String id) 
	{
		System.out.println("...invoking getPartnerid, Partner Name is "+ id);
		Long partnerId = Long.parseLong(id);
		Partnerid partnerid = partnerids.get(partnerId);
		return partnerid;		
	}

	public Response updatePartnerid(Partnerid updatedPartnerid) 
	{
		System.out.println("...invoking updatePartner, Partner Name is "+ updatedPartnerid.getName());
		Partnerid currentPartnerid = partnerids.get(updatedPartnerid.getId());
		
		Response response = null;
		if(currentPartnerid != null)
		{
			partnerids.put(updatedPartnerid.getId(), updatedPartnerid);
			response = Response.ok().build();
		}
		else
		{
			response = Response.notModified().build();
		}
		
		return response;
	}

	public Response deletePartnerid(String id) 
	{
		System.out.println("...invoking deletePartner, Partner Name is "+ id);
		Long partnerId = Long.parseLong(id);
		Partnerid partnerid = partnerids.get(partnerId);
		Response response = null;
		if(partnerid!=null)
		{
			partnerids.remove(partnerId);
			response = Response.ok().build();
		}
		else
		{
			response = Response.notModified().build();
		}
		return response;
	}

	public Adcontent getAdcontent(String adcontentId) 
	{
		long id = Long.parseLong(adcontentId);
		Adcontent adcontent = adcontents.get(id);
		return adcontent;
	}
}

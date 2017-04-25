package com.chevrolet.trainings.jaxrs;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Adcontent")
public class Adcontent {
	private long id;
	private String description;
	private Map<Long, Duration> adcontents = new HashMap<Long, Duration>();

	public Adcontent() {
		init();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@GET
	@Path("/duration/{id}")
	public Duration getDuration(@PathParam("id")String durationid) {
		System.out.println("----invoking getDuration with id: " + durationid);
		Duration duration = adcontents.get(new Long(durationid));
		return duration;
	}

	final void init() {
		Duration duration = new Duration();
		duration.setId(323);
		duration.setDescription("Keep ad for 3 months");
		adcontents.put(duration.getId(), duration);
	}
}

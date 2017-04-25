package com.chevrolet.trainings.jaxrs;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Duration")
public class Duration {
	private long id;
	private String description;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String d) {
		this.description = d;
	}
}

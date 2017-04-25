package com.chevrolet.trainings.jaxrs;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Partnerid")
public class Partnerid
{
	private long id;
	private String name;

	public Partnerid() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

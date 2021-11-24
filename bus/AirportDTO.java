package com.xworkz.bus;

public class AirportDTO {

	private String id;
	private String name;
	private String location;
	private String type;
	
	public AirportDTO(String id, String name, String location, String type) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
 }
	
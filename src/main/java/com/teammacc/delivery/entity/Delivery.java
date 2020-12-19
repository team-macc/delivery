package com.teammacc.delivery.entity;

import java.io.Serializable;

public class Delivery implements Serializable{

	private static final long serialVersionUID = -7928216092660191533L;
	
	private Long id;
	
	private String address;
	
	private String status;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


}

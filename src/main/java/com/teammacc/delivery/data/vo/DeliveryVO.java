package com.teammacc.delivery.data.vo;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;



@JsonPropertyOrder({"id","address", "status"})
public class DeliveryVO implements Serializable {

	private static final long serialVersionUID = -5642252379268168941L;
	
	@JsonProperty("id")
	private Long id;
	
	@JsonProperty("address")
	private String address;
	
	@JsonProperty("status")
	private String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

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

	
}

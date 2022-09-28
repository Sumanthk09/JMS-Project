package com.example.demo.dto;

public class orderstatus 
{
	private order order;
	private String status;
	private String message;
	
	public orderstatus() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public orderstatus(com.example.demo.dto.order order, String status, String message) {
		super();
		this.order = order;
		this.status = status;
		this.message = message;
	}

	public order getOrder() {
		return order;
	}
	public void setOrder(order order) {
		this.order = order;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}

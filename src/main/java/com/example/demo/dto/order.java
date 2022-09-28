package com.example.demo.dto;

public class order 
{
	private String orderid;
	private String ordername;
	private int qty;
	private double price;
	
	public order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public order(String orderid, String ordername, int qty, double price) {
		super();
		this.orderid = orderid;
		this.ordername = ordername;
		this.qty = qty;
		this.price = price;
	}

	public String getOrderid() {
		return orderid;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}

	public String getOrdername() {
		return ordername;
	}

	public void setOrdername(String ordername) {
		this.ordername = ordername;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}

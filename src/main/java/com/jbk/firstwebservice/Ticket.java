package com.jbk.firstwebservice;

public class Ticket {
	String name;
	String MobNumber;
	String Qty;
	String Price;
	public Ticket(String name, String mobNumber, String qty, String price) {
		super();
		this.name = name;
		MobNumber = mobNumber;
		Qty = qty;
		Price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobNumber() {
		return MobNumber;
	}
	public void setMobNumber(String mobNumber) {
		MobNumber = mobNumber;
	}
	public String getQty() {
		return Qty;
	}
	public void setQty(String qty) {
		Qty = qty;
	}
	public String getPrice() {
		return Price;
	}
	public void setPrice(String price) {
		Price = price;
	}
	@Override
	public String toString() {
		return "Ticket [name=" + name + ", MobNumber=" + MobNumber + ", Qty=" + Qty + ", Price=" + Price + "]";
	}
	
	
	
}

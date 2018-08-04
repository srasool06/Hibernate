package com.java.hibernate;

public class Customer {

	private int cid;
	private String cname;
	private int venId;
	private Vendor parent;
	public Vendor getParent() {
		return parent;
	}
	public void setParent(Vendor parent) {
		this.parent = parent;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getVenId() {
		return venId;
	}
	public void setVenId(int venId) {
		this.venId = venId;
	}

}

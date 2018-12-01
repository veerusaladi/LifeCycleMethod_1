package com.app.model;

public class Dummy {

	private int did;
	public void name() {
		System.out.println("iam from init().....");
	}
	public void name1() {

		System.out.println("iam from destroy().....");
	}
	public Dummy() {
		super();
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	@Override
	public String toString() {
		return "Dummy [did=" + did + "]";
	}


}

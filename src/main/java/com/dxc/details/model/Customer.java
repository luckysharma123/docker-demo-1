package com.dxc.details.model;


public class Customer {
	private String firstName;
	private String lastName;
	private String phoneNo;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String firstName, String lastName, String phoneNo) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNo = phoneNo;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", phoneNo=" + phoneNo + "]";
	}
	
}

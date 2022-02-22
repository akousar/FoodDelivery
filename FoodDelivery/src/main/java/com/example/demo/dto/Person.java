package com.example.demo.dto;

public class Person {
	private String email;
	private String name;
	private String password;
	private Address address;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Person(String email, String name, String password, Address address) {
		super();
		this.email = email;
		this.name = name;
		this.password = password;
		this.address = address;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}

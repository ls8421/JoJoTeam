package com.newton.dto;

public class Person {
	private int id;
	private String name;
	private String phone;
	
	public static Person create(int id, String name, String phone) {
		Person person = new Person();
		person.setId(id);
		person.setName(name);
		person.setPhone(phone);
		return person;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}

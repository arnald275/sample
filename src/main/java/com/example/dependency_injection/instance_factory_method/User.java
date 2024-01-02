package com.example.dependency_injection.instance_factory_method;

public class User {
	private String name;
	private String city;
	
	public User(String name,String address) {
		this.name=name;
		this.city=address;
	}
	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}
}

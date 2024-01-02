package com.example.dependency_injection.instance_factory_method;
import com.github.javafaker.Faker;
public class RandomGenerator {
	
	private Faker faker;
	
	public RandomGenerator(Faker faker) {
		this.faker=faker;
	}
	
	
	public User generateUser() {
		return new User(faker.name().firstName(),faker.address().city());
	}
	

}

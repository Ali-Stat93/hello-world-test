package org.demo.example.model;

public class User {
	private String firstName;
	private int age;

	/**
	 * @param firstName
	 */
	public User(String firstName) {
		this.firstName = firstName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", age=" + age + "]";
	}
	
	
	
}

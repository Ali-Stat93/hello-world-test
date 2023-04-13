package org.demo.example.model;

public class User {
	private String firstName;

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

	@Override
	public String toString() {
		return "User [firstName=" + firstName + "]";
	}
	
	
	
}

package com.practice.Entity;

public class User {
	private String firstName;
	private String MiddleName;
	private String lastName;
	private long dateOfBirth;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return MiddleName;
	}
	public void setMiddleName(String middleName) {
		MiddleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public long getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(long dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", MiddleName=" + MiddleName + ", lastName=" + lastName
				+ ", dateOfBirth=" + dateOfBirth + "]";
	}
	
	
}

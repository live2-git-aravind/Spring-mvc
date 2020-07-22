package com.live.model;

public class Customer {
	public Customer() {
		
	}
	private String firstName; 
	private String lastName; 
	private String email;
	private int id;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
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
@Override
public String toString() {
	return "Customer [firstName=" + firstName + ", lastName=" + lastName + "]";
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

}

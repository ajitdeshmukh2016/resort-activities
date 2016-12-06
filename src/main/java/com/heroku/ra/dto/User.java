package com.heroku.ra.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.heroku.ra.entities.Contact;

public class User {
	
	private String firstname;
	private String lastname;
	private String email;
	private String password;
	
	@JsonProperty("confirm_password")
	private String confirmPassword;

	public User(){
		super();
	}
	
	public User(String firstname, String lastname, String email, String password, String confirmPassword) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
		this.confirmPassword = confirmPassword;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public Contact toContact() {
		Contact c = new Contact();
		c.setEmail(this.email);
		c.setFirstname(this.firstname);
		c.setLastname(this.lastname);
		c.setPassword(this.password);
		return c;
	}

}

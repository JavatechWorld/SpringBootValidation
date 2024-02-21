package com.spring.implementation.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;

public class Users {
	@NotEmpty(message = "Name can not be empty")
	private String name;
	@NotEmpty(message = "Email Can not be Empty")
	@Email(message = "Email should be valid")
	private String email;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}

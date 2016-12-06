package com.heroku.ra.exceptions;

public class IncorrectPassword extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4239406361507620790L;

	public IncorrectPassword(String username){
		super("Password for " + username + " does not match with stored password");
	}
	
	public IncorrectPassword(){
		super();
	}
}

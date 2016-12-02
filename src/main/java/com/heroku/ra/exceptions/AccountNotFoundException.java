/*
 * Created on 2 Dec 2016 ( Time 16:47:10 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */

package com.heroku.ra.exceptions;

public class AccountNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -1L;

	public AccountNotFoundException(Integer id) {
		super("Account not found with id: " + id.toString());
	}

	public AccountNotFoundException(String account) {
		super("Account " + account + " not found!");
	}
}
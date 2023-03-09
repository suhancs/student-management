package com.techpalle.Dao;

public class AccessData {
	private String name;
	private String email;
	private String password;
	private String states;
	
	
	
	public AccessData(String name, String email, String password, String states) 
	{
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.states = states ;
	}
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getStates() {
		return states;
	}
	public void setState(String states) {
		states = states;
	}
	
}

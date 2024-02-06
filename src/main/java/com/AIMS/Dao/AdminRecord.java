package com.AIMS.Dao;

import java.io.InputStream;

import org.apache.tomcat.jakartaee.commons.compress.archivers.ArchiveInputStream;

public class AdminRecord {

private String name;
private String role;
private String username;
private String password;
private String email;



public AdminRecord()
{
	
}



public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getRole() {
	return role;
}


public void setRole(String role) {
	this.role = role;
}


public String getUsername() {
	return username;
}


public void setUsername(String username) {
	this.username = username;
}


public String getPassword() {
	return password;
}


public void setPassword(String password) {
	this.password = password;
}


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}



public AdminRecord(String name, String role, String username, String password, String email) {
	super();
	this.name = name;
	this.role = role;
	this.username = username;
	this.password = password;
	this.email = email;
	
}



@Override
public String toString() {
	return "AdminRecord [name=" + name + ", role=" + role + ", username=" + username + ", password=" + password
			+ ", email=" + email + ", imageStream=" + "]";
}



}

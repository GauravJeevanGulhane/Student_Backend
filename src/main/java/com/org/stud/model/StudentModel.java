package com.org.stud.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table()
public class StudentModel 
{
	@Id
	@Column(name="sid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sid;
	@Column(name="sname")
	private String name;
	@Column(name="semail")
	private String email;
	@Column(name="scontact")
	private String contact;
	public int getId() {
		return sid;
	}
	public void setId(int sid) {
		this.sid = sid;
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
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	
}

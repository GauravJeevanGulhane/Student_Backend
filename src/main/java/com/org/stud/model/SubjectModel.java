package com.org.stud.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="subject")
public class SubjectModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="subid")
	private int subid;
	@Column(name="subname")
	private String subname;
	public int getId() {
		return subid;
	}
	public void setId(int subid) {
		this.subid = subid;
	}
	public String getSubname() {
		return subname;
	}
	public void setSubname(String subname) {
		this.subname = subname;
	}
}

package com.org.stud.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "marks")
public class MarkModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "markid")
	private long markId;
	@ManyToOne
	@JoinColumn(name = "sid")
	private StudentModel student;
	@ManyToOne
	@JoinColumn(name = "subid")
	private SubjectModel subject;
	@Column(name = "marks")
	private double marks;

	public long getMarkId() {
		return markId;
	}

	public void setMarkId(long markId) {
		this.markId = markId;
	}

	public StudentModel getStudent() {
		return student;
	}

	public void setStudent(StudentModel student) {
		this.student = student;
	}

	public SubjectModel getSubject() {
		return subject;
	}

	public void setSubject(SubjectModel subject) {
		this.subject = subject;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

}

package com.org.stud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.org.stud.model.AdminModel;
import com.org.stud.model.MarkModel;
import com.org.stud.model.StudentModel;
import com.org.stud.model.SubjectModel;
import com.org.stud.service.StudentSevice;

@RestController
@CrossOrigin(origins = "http://localhost:3001")
public class StudentController {
	@Autowired
	StudentSevice studServ;
	boolean b;

	@PostMapping("/save")

	public String isSaveAdmindata(@RequestBody AdminModel model) {
		b = studServ.isSaveAdmindata(model);
		return (b) ? "Admin record Save " : "Somthing went wrong ";
	}

	@GetMapping("/viewadmin")
	public List<AdminModel> getAdmin() {
		return studServ.getAdmin();
	}

	@PostMapping("/savestud")
	public String isSaveStudent(@RequestBody StudentModel model) {
		b = studServ.isSaveStudent(model);
		return (b) ? "Student record Save " : "Somthing went wrong ";
	}
	@GetMapping("/viewstudent")
	public List<StudentModel> getStudent() {
		return studServ.getStudents();
	}

	@PostMapping("/savesub")
	public String isSaveSubject(@RequestBody SubjectModel model) {
		b = studServ.isSaveSubject(model);
		return (b) ? "Subject added..." : "Some problem is there...";
	}

	@GetMapping("/viewsubject")
	public List<SubjectModel> getSubject() {
		return studServ.getSubject();
	}
	
	@PostMapping("/savemark")
	public String isSaveMark(@RequestBody MarkModel model) {
		b = studServ.isSaveMarks(model);
		return (b) ? "Mark save" : "Mark not save...";
	}
	@GetMapping("/viewmark")
	public List<MarkModel> getMark() {
		return studServ.getMarks();
	}

}

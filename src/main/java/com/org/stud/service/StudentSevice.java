package com.org.stud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.stud.model.AdminModel;
import com.org.stud.model.MarkModel;
import com.org.stud.model.StudentModel;
import com.org.stud.model.SubjectModel;
import com.org.stud.repository.AdminRepository;
import com.org.stud.repository.MarkRepository;
import com.org.stud.repository.StudentRepository;
import com.org.stud.repository.SubjectRepository;
@Service("studServ")
public class StudentSevice {
	
	@Autowired 
	AdminRepository adrepo;
	
	@Autowired
	StudentRepository studRepo;

	@Autowired
	SubjectRepository subrepo;
	
	
	public boolean isSaveAdmindata(AdminModel model) {
		AdminModel m=adrepo.save(model);
		return m!=null?true:false;
	}
	public List<AdminModel> getAdmin(){
		List<AdminModel> list=adrepo.findAll();
		return list;
	}
	
	public boolean isSaveStudent(StudentModel model) {
		StudentModel sm=studRepo.save(model);
		return sm!=null?true:false;
	}
	public List<StudentModel> getStudents(){
		List<StudentModel> list=studRepo.findAll();
		return list;
	}
	
	public boolean isSaveSubject(SubjectModel model) {
		SubjectModel smm=subrepo.save(model);
		return smm!=null?true:false;
	}
	public List<SubjectModel> getSubject(){
		List<SubjectModel> list=subrepo.findAll();
		return list;
	}
	
	@Autowired
	MarkRepository markrepo;
	public boolean isSaveMarks(MarkModel model) {
		MarkModel mm=markrepo.save(model);
		return mm!=null?true:false;
	}
	public List<MarkModel> getMarks(){
		List<MarkModel> list=markrepo.findAll();
		return list;
	}
}

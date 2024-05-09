package com.org.stud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.org.stud.model.StudentModel;
@Repository("studrepo")
public interface StudentRepository extends JpaRepository<StudentModel, Integer>
{

}

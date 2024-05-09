package com.org.stud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.org.stud.model.SubjectModel;
@Repository("subrepo")
public interface SubjectRepository extends JpaRepository<SubjectModel, Integer> {

}

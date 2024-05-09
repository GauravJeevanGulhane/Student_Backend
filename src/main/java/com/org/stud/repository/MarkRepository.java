package com.org.stud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.org.stud.model.MarkModel;


@Repository("markrepo")
public interface MarkRepository extends JpaRepository<MarkModel, Integer>{

}

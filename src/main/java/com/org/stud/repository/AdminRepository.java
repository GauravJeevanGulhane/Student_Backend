package com.org.stud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.org.stud.model.AdminModel;
@Repository("adrepo")
public interface AdminRepository extends JpaRepository<AdminModel, Integer> {

}

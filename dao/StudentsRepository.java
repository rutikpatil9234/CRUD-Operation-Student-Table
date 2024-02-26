package com.neosoft.digiadmin.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.neosoft.digiadmin.entity.Students;

@Repository
public interface StudentsRepository extends JpaRepository<Students, Long>{

	
	
}

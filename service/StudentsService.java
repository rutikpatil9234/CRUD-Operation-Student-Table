package com.neosoft.digiadmin.service;

import java.util.List;

import com.neosoft.digiadmin.entity.Students;

public interface StudentsService {
	
	public void saveStudentsData (Students studentData);
	
	public void updateStudentData (Students studentData);
	
	public List<Students> getAllStudentDetails();
	
	public Students getstudentDataById(Long id);
	
	public void deletestudentData (Long id);

}

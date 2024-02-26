package com.neosoft.digiadmin.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.neosoft.digiadmin.entity.Students;
import com.neosoft.digiadmin.serviceimpl.StudentsServiceImpl;

@RestController
@RequestMapping ("/students")
public class StudentsDetails {
	
	@Autowired
	StudentsServiceImpl  studentsServiceImpl;
	
	
	
	@PostMapping("/save-studentdata")
	public ResponseEntity<Map<String, String>> savestudentDetail(@RequestBody Students studentData ){
		Map<String, String> responseMsg = new HashMap<>();
		studentsServiceImpl.saveStudentsData(studentData);
		responseMsg.put("message", "Students Details Insert Successfully");
		return ResponseEntity.ok(responseMsg);	
	}
	
	
	@PutMapping("/update-studentdata ")
	public ResponseEntity<Map<String, String>> updateStudentDetail(@RequestBody  Students studentData){
		Map<String, String> responseMsg = new HashMap<>();
		studentsServiceImpl.updateStudentData(studentData);
		responseMsg.put("message", "Students Details Update Successfully");
		return ResponseEntity.ok(responseMsg);
	}
	
	
	
	@GetMapping("/student-details")
	public ResponseEntity<List<Students>> getAllCustDetails(){
		List<Students> studentList = studentsServiceImpl.getAllStudentDetails();    // it will give list of the all data
		return new ResponseEntity<>(studentList,HttpStatus.OK);
	}
	
	
	@GetMapping("/student-details/{id}")
	public ResponseEntity <Students> getstudentDetailsById( @PathVariable Long id){
		  Students studentData =  studentsServiceImpl.getstudentDataById(id);
		  return new ResponseEntity<>(studentData,HttpStatus.OK);
	}
	
	
	@DeleteMapping("/delete-student/{id}")
	public String deletestudent (@PathVariable long id) {
		studentsServiceImpl.deletestudentData(id);
		return "Student Delete Successfully";
	}

}

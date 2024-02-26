package com.neosoft.digiadmin.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neosoft.digiadmin.dao.StudentsRepository;
import com.neosoft.digiadmin.entity.CustomerDetails;
import com.neosoft.digiadmin.entity.Students;
import com.neosoft.digiadmin.service.StudentsService;

import jakarta.persistence.NoResultException;

@Service
public class StudentsServiceImpl implements StudentsService{

	@Autowired
	StudentsRepository  studentsRepo;

	@Override
	public void saveStudentsData(Students studentData) {
		studentsRepo.save(studentData);
		
	}

	@Override
	public void updateStudentData(Students studentData) {
		studentsRepo.save(studentData);
		
	}

	@Override
	public List<Students> getAllStudentDetails() {
		List<Students> studentDetailsList = studentsRepo.findAll();
		if( studentDetailsList !=null && !studentDetailsList.isEmpty()) {
			return studentDetailsList;
		}else {
			throw new NoResultException("No Records Present in Customer");
		}
	}
	

	@Override
	public Students getstudentDataById(Long id) {
		Optional<Students> studentData = studentsRepo.findById(id);
		if(studentData.isPresent()) {
			return studentData.get();
		}else {
			throw new NullPointerException("No Records Founds");
			}
		
	}

	@Override
	public void deletestudentData(Long id) {
		studentsRepo.deleteById(id);
		
	}
	
	
	
	
	

}

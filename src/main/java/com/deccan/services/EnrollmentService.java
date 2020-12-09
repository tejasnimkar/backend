package com.deccan.services;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deccan.dto.EnrollmentDto;
import com.deccan.dto.EnrollmentListDto;
import com.deccan.entity.Enrollment;
import com.deccan.repositories.BatchRepository;
import com.deccan.repositories.EnrollmentRepository;
import com.deccan.repositories.PlanRepository;
import com.deccan.repositories.UserRespository;
import com.deccan.spring.config.AppConfig;

@Service
public class EnrollmentService implements IEnrollmentService{
	
	@Autowired
	UserRespository userRepository;
	
	@Autowired
	PlanRepository planRepository;
	
	@Autowired
	BatchRepository batchRepository;
	
	@Autowired
	EnrollmentRepository enrollmentRepository;
	
	
	@Autowired
	AppConfig appConfig;
	
	
	public List<Enrollment> getEnrollments() {
		return enrollmentRepository.findAll();
	}
	
	public String addEnrollment(EnrollmentDto enrollmentDto) {
		Enrollment enrollment = new Enrollment();
		
		BeanUtils.copyProperties(enrollmentDto, enrollment);
		enrollment.setPlan(planRepository.findById(enrollmentDto.getPlanId()).get());
		enrollment.setBatch(batchRepository.findById(enrollmentDto.getBatchId()).get());
		enrollment.setUser(userRepository.findById(enrollmentDto.getUserId()).get());
		enrollment.setManager(userRepository.findById(enrollmentDto.getManagerId()).get());
		
		enrollmentRepository.save(enrollment);
		return "Success";
	}

	@Override
	public List<TypeMap<Enrollment, EnrollmentListDto>> getAllEnrollments() {
		
		List<Enrollment>enrollmentList=enrollmentRepository.findAll();
		
		
		ModelMapper modelMapper=appConfig.modelMapper();
		
		List<TypeMap<Enrollment, EnrollmentListDto>>enrollListDto=enrollmentList.
				stream().map(enrollment->modelMapper
						.typeMap(Enrollment.class, EnrollmentListDto.class).
						addMappings(mapper->{
							mapper.map(Enrollment::getStatus, EnrollmentListDto::getStatus);
							mapper.map(Enrollment::getUser, EnrollmentListDto::getFirstName);
						}).collect(Collectors.toList()).collect(Collectors.toList());
		
						//(enrollmentList, EnrollmentListDto.class)).collect(Collectors.toList());
		
		return enrollListDto;
	}
}
















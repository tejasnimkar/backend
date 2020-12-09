package com.deccan.controller;

import java.util.List;

import org.modelmapper.TypeMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deccan.dto.BatchDto;
import com.deccan.dto.EnrollmentListDto;
import com.deccan.entity.Batch;
import com.deccan.entity.Enrollment;
import com.deccan.services.IBatchService;
import com.deccan.services.IEnrollmentService;
import com.deccan.services.IPlanService;
import com.deccan.services.IReviewService;
import com.deccan.services.ISportService;
import com.deccan.services.IUserService;

@RestController
@RequestMapping("/manager")
public class ManagerController {
	
	
	@Autowired
	ISportService sportService;
	
	@Autowired
	IPlanService planService;
	

	@Autowired
	IBatchService batchService;
	
	@Autowired
	IReviewService reviewService;
	
	@Autowired
	IEnrollmentService enrollmentService;
	
	@Autowired
	IUserService userService;
	
	
	@GetMapping("/batch")
	public List<Batch> getBatches(){
		return batchService.getBatch(); 
	}
	@PostMapping("/batch")
	public String addBatch(@RequestBody BatchDto batchDto) {
		batchDto.setAvailability(batchDto.getSize());
		return batchService.addBatch(batchDto);
	}
	
	@GetMapping("/enrollment-list")
	public List<TypeMap<Enrollment, EnrollmentListDto>> getEnrollmentsList(){
		return enrollmentService.getAllEnrollments();
	}

	@GetMapping("/enrollment")
	public List<Enrollment> getEnrollments(){
		return enrollmentService.getEnrollments();
	}
}

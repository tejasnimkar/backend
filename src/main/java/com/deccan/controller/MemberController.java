package com.deccan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deccan.dto.EnrollmentDto;
import com.deccan.services.IBatchService;
import com.deccan.services.IEnrollmentService;
import com.deccan.services.IPlanService;
import com.deccan.services.IReviewService;
import com.deccan.services.ISportService;
import com.deccan.services.IUserService;

@RestController
@RequestMapping("/member")
public class MemberController {
	
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
	
	@PostMapping("/enrollment")
	public String addEnrollment(@RequestBody EnrollmentDto newEnrollment) {
		
		
		
		return "";
	}

}

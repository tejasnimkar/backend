package com.deccan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deccan.services.IBatchService;
import com.deccan.services.IEnrollmentService;
import com.deccan.services.IPlanService;
import com.deccan.services.IReviewService;
import com.deccan.services.ISportService;
import com.deccan.services.IUserService;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
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
	
	
	
	
}

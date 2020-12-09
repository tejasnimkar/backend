package com.deccan.services;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deccan.dto.PlanDto;
import com.deccan.entity.Plan;
import com.deccan.repositories.BatchRepository;
import com.deccan.repositories.PlanRepository;
import com.deccan.repositories.SportRepository;
import com.deccan.repositories.UserRespository;

@Service
public class PlanService implements IPlanService{
	
	@Autowired
	PlanRepository planRepository;
	
	@Autowired
	UserRespository userRepository;
	
	@Autowired
	SportRepository sportRepository;
	
	@Autowired
	BatchRepository batchRepository;
	
	public Optional<Plan> getPlanById(int id) {
		return planRepository.findById(id);
	}
	
	public String addPlan(PlanDto plan) {
		
		Plan planEntity =new Plan();
		BeanUtils.copyProperties(plan, planEntity);
		System.out.println(plan.getManagerId());
		System.out.println(planRepository.findById(plan.getManagerId()).get().toString());
		planEntity.setManager(userRepository.findById(plan.getManagerId()).get());
		planEntity.setSport(sportRepository.findById(plan.getSportId()).get());
		System.out.println(planEntity.toString());
		planRepository.save(planEntity);

		return "success";
	}
}

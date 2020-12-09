package com.deccan.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.deccan.entity.Plan;
@Repository
public interface PlanRepository extends JpaRepository<Plan, Integer> {
	
}

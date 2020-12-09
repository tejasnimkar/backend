package com.deccan.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deccan.entity.User;
@Repository
public interface UserRespository extends JpaRepository<User, Integer> {
	
}

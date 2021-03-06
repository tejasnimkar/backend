package com.deccan.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deccan.entity.Sport;
@Repository
public interface SportRepository extends JpaRepository<Sport, Integer> {

}

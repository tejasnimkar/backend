package com.deccan.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deccan.entity.Batch;
@Repository
public interface BatchRepository extends JpaRepository<Batch, Integer> {

}

package com.deccan.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deccan.entity.Address;
@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {

}

package com.deccan.services;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deccan.dto.BatchDto;
import com.deccan.entity.Batch;
import com.deccan.repositories.BatchRepository;
import com.deccan.repositories.SportRepository;
import com.deccan.repositories.UserRespository;

@Service
public class BatchService implements IBatchService  {

	@Autowired
	UserRespository userRepository;
	
	@Autowired
	SportRepository sportRepository;
	
	@Autowired
	BatchRepository batchRepository;
	
	public List<Batch> getBatch() {
		return batchRepository.findAll();
	}
	@Override
	public String addBatch( BatchDto batch) {
		Batch batchEntity = new Batch();
		
		BeanUtils.copyProperties(batch, batchEntity);
		batchEntity.setManager(userRepository.findById(batch.getManagerId()).get());
		batchEntity.setSport(sportRepository.findById(batch.getSportId()).get());
		
		batchRepository.save(batchEntity);
		return "success .";
	}
}

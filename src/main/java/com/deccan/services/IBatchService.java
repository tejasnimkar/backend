package com.deccan.services;

import java.util.List;

import com.deccan.dto.BatchDto;
import com.deccan.entity.Batch;

public interface IBatchService {
	public String addBatch( BatchDto batch) ;

	public List<Batch> getBatch();
	
}

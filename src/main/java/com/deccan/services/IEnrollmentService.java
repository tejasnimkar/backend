package com.deccan.services;

import java.util.List;

import org.modelmapper.TypeMap;

import com.deccan.dto.EnrollmentListDto;
import com.deccan.entity.Enrollment;

public interface IEnrollmentService {

	List<Enrollment> getEnrollments();

	List<TypeMap<Enrollment, EnrollmentListDto>> getAllEnrollments();

}

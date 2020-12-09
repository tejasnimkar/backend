package com.deccan.dto;

import java.time.LocalDate;

import com.deccan.enums.StatusType;

public class EnrollmentDto {
	private StatusType status;
	private LocalDate startDate;
	private LocalDate endDate;
	private double amountPaid;
	private LocalDate appliedDate;
	private int planId;
	private int batchId;
	private int userId;
	private int managerId;
	
	
	
	
	
	public EnrollmentDto(StatusType status, LocalDate startDate, LocalDate endDate, double amountPaid,
			LocalDate appliedDate, int planId, int batchId, int userId, int managerId) {
		super();
		this.status = status;
		this.startDate = startDate;
		this.endDate = endDate;
		this.amountPaid = amountPaid;
		this.appliedDate = appliedDate;
		this.planId = planId;
		this.batchId = batchId;
		this.userId = userId;
		this.managerId = managerId;
	}
	public StatusType getStatus() {
		return status;
	}
	public void setStatus(StatusType status) {
		this.status = status;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public double getAmountPaid() {
		return amountPaid;
	}
	public void setAmountPaid(double amountPaid) {
		this.amountPaid = amountPaid;
	}
	public LocalDate getAppliedDate() {
		return appliedDate;
	}
	public void setAppliedDate(LocalDate appliedDate) {
		this.appliedDate = appliedDate;
	}
	public int getPlanId() {
		return planId;
	}
	public void setPlanId(int planId) {
		this.planId = planId;
	}
	public int getBatchId() {
		return batchId;
	}
	public void setBatchId(int batchId) {
		this.batchId = batchId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	
	
}

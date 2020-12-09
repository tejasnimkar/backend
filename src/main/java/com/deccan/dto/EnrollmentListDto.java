package com.deccan.dto;

import java.time.LocalDate;
import java.time.LocalTime;

import com.deccan.enums.StatusType;


//enrollment list for manager
public class EnrollmentListDto {
	
	
	private String firstName;
	private String lastName;
	private LocalTime startTime;
	private LocalTime endTime;
	private int availability;
	private String sportName;
	private String planName;
	private StatusType status;
	private LocalDate endDate;
	private int duration;
	
	
	public EnrollmentListDto() {
		super();
	}


	public EnrollmentListDto(String firstName, String lastName, LocalTime startTime, LocalTime endTime,
			int availability, String sportName, String planName, StatusType status, LocalDate endDate) {
		super();
	//	this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.startTime = startTime;
		this.endTime = endTime;
		this.availability = availability;
		this.sportName = sportName;
		this.planName = planName;
		this.status = status;
		this.endDate = endDate;
	}


//	public String getUserId() {
//		return userId;
//	}
//
//
//	public void setUserId(String userId) {
//		this.userId = userId;
//	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public LocalTime getStartTime() {
		return startTime;
	}


	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}


	public LocalTime getEndTime() {
		return endTime;
	}


	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}


	public int getAvailability() {
		return availability;
	}


	public void setAvailability(int availability) {
		this.availability = availability;
	}


	public String getSportName() {
		return sportName;
	}


	public void setSportName(String sportName) {
		this.sportName = sportName;
	}


	public String getPlanName() {
		return planName;
	}


	public void setPlanName(String planName) {
		this.planName = planName;
	}


	public StatusType getStatus() {
		return status;
	}


	public void setStatus(StatusType status) {
		this.status = status;
	}


	public LocalDate getEndDate() {
		return endDate;
	}


	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}


	public int getDuration() {
		return duration;
	}


	public void setDuration(int duration) {
		this.duration = duration;
	}


	@Override
	public String toString() {
		return "EnrollmentListDto [firstName=" + firstName + ", lastName=" + lastName + ", startTime=" + startTime
				+ ", endTime=" + endTime + ", availability=" + availability + ", sportName=" + sportName + ", planName="
				+ planName + ", status=" + status + ", endDate=" + endDate + ", duration=" + duration + "]";
	}



	
	

}

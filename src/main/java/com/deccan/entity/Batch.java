package com.deccan.entity;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Batch {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "start_time",nullable = false)
	private LocalTime startTime;
	
	@Column(name = "end_time",nullable = false)
	private LocalTime endTime;
	
	@Column(name = "created_on",nullable = false)
	private LocalDate createdOn;
	
	@Column(nullable = false)
	private int size;
	
	@Column(nullable = false)
	private int availability;
	
	@Column(name = "is_active",nullable = false,columnDefinition = "boolean default true")
	private boolean isActive=true;
	
	@JsonManagedReference
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "sport_id", referencedColumnName = "id",nullable = false)
	private Sport sport;
	
	@JsonManagedReference
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "manager_id", referencedColumnName = "id",nullable = false)
	private User manager;

	@JsonBackReference
	@OneToMany(mappedBy = "batch",orphanRemoval = true,cascade = CascadeType.PERSIST)
	private List<Enrollment> enrollment;
	
	public Batch() {
		super();
		// TODO Auto-generated constructor stub
	}

	//getter and setters
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public LocalDate getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(LocalDate createdOn) {
		this.createdOn = createdOn;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getAvailability() {
		return availability;
	}

	public void setAvailability(int availability) {
		this.availability = availability;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public Sport getSport() {
		return sport;
	}

	public void setSport(Sport sport) {
		this.sport = sport;
	}

	public User getManager() {
		return manager;
	}

	public void setManager(User manager) {
		this.manager = manager;
	}

	public List<Enrollment> getEnrollment() {
		return enrollment;
	}

	public void setEnrollment(List<Enrollment> enrollment) {
		this.enrollment = enrollment;
	}
	
	
	
	
}

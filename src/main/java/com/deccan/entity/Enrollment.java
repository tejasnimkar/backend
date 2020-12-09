package com.deccan.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.deccan.enums.StatusType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Enrollment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Enumerated(EnumType.STRING)
	private StatusType status;
	private LocalDate startDate;//jab enrollment start hoga tab
	private LocalDate endDate;
	private double amountPaid;
	private LocalDate appliedDate;//.now function
	
	@JsonManagedReference
	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.EAGER)
	@JoinColumn(name = "plan_id", referencedColumnName = "id")
	private Plan plan;
	
	@JsonManagedReference
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "batch_id", referencedColumnName = "id")
	private Batch batch;
	
	@JsonManagedReference
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "user_id", referencedColumnName = "id")
	private User user;
	
	@JsonManagedReference
	@ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.EAGER)
	@JoinColumn(name = "manager_id", referencedColumnName = "id")
	private User manager;

	public Enrollment() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//getter and setters

	public Enrollment(StatusType status, LocalDate startDate, LocalDate endDate, double amountPaid,
			LocalDate appliedDate, Plan plan, Batch batch, User user, User manager) {
		super();
		this.status = status;
		this.startDate = startDate;
		this.endDate = endDate;
		this.amountPaid = amountPaid;
		this.appliedDate = appliedDate;
		this.plan = plan;
		this.batch = batch;
		this.user = user;
		this.manager = manager;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public Plan getPlan() {
		return plan;
	}

	public void setPlan(Plan plan) {
		this.plan = plan;
	}

	public Batch getBatch() {
		return batch;
	}

	public void setBatch(Batch batch) {
		this.batch = batch;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public User getManager() {
		return manager;
	}

	public void setManager(User manager) {
		this.manager = manager;
	}
	
	
	
	
}

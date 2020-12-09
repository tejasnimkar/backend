package com.deccan.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Sport {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "sport_name",nullable = false)
	private String sportName;
	
	@Column(name = "is_active",nullable = false,columnDefinition = "boolean default true")
	private boolean isActive=true;
	
	@JsonBackReference
	@OneToMany(mappedBy = "sport",orphanRemoval = true)
	private Set<Plan> plan;
	
	@JsonBackReference
	@OneToMany(mappedBy = "sport",orphanRemoval = true)
	private List<Batch> batch;

	public Sport() {
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

	public String getSportName() {
		return sportName;
	}

	public void setSportName(String sportName) {
		this.sportName = sportName;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public Set<Plan> getPlan() {
		return plan;
	}

	public void setPlan(Set<Plan> plan) {
		this.plan = plan;
	}

	public List<Batch> getBatch() {
		return batch;
	}

	public void setBatch(List<Batch> batch) {
		this.batch = batch;
	}

	
}

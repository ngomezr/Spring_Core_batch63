package com.cogent.boot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="Plans")
public class Plans {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)  
	private int id;
	@Column(name="plan")
	private String plan;
	@Column(name="name")
	private String name;
	@Column(name="cost")
	private double cost;
	@Column(name="validity")
	private String validity;
	
	public Plans() {
		super();
	}

	public Plans(int id, String plan, String name, double cost, String validity) {
		super();
		this.id = id;
		this.plan = plan;
		this.name = name;
		this.cost = cost;
		this.validity = validity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getValidity() {
		return validity;
	}

	public void setValidity(String validity) {
		this.validity = validity;
	}

	@Override
	public String toString() {
		return "Plans [id=" + id + ", plan=" + plan + ", name=" + name + ", cost=" + cost + ", validity=" + validity
				+ "]";
	}
}

package com.cogent.boot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Customercare")
public class Customercare {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)  
	private int id;
	@Column(name="complaint")
	private String complaint;
	@Column(name="description")
	private String description;
	@Column(name="userId")
	private int userId;
	@Column(name="statusOfComplain")
	private String statusOfComplain; // Either "Ongoing" or "Completed" 
	
	public Customercare() {
		super();
	}

	public Customercare(int id, String complaint, String description, int userId, String statusOfComplain) {
		super();
		this.id = id;
		this.complaint = complaint;
		this.description = description;
		this.userId = userId;
		this.statusOfComplain = statusOfComplain;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getComplaint() {
		return complaint;
	}

	public void setComplaint(String complaint) {
		this.complaint = complaint;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getStatusOfComplain() {
		return statusOfComplain;
	}

	public void setStatusOfComplain(String statusOfComplain) {
		this.statusOfComplain = statusOfComplain;
	}

	@Override
	public String toString() {
		return "Customercare [id=" + id + ", complaint=" + complaint + ", description=" + description + ", userId="
				+ userId + ", statusOfComplain=" + statusOfComplain + "]";
	}
}

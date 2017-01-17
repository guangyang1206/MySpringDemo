package com.epam.java.mentoring.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "police_force")
public class PoliceForce implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private Integer code;

	@Column(name = "label", nullable = false)
	private String label;

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
}

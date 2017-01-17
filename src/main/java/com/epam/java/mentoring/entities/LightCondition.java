package com.epam.java.mentoring.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "light_condition")
public class LightCondition implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private Integer code;

	@Column(name = "label", nullable = false)
	private String label;

	/*
	 * @OneToOne(cascade = CascadeType.ALL)
	 * 
	 * @JoinColumn(name = "accidentIndex") private Accident accident;
	 */

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

package com.epam.java.mentoring.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "road_surface")
public class RoadSurfaceCondition implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	private Integer code;
	private String label;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "roadSurfaceCondition")
	private List<Accident> accidents;

	public List<Accident> getAccidents() {
		return accidents;
	}

	public void setAccidents(List<Accident> accident) {
		this.accidents = accident;
	}

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

package com.epam.java.mentoring.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.epam.java.mentoring.entities.RoadSurfaceCondition;
import com.epam.java.mentoring.model.RoadAccident;

@Repository
public interface RoadSurfaceConditionRepository extends CrudRepository<RoadSurfaceCondition, Integer> {
	Iterable<RoadAccident> getAllAccidentsByLabel(String label);
}

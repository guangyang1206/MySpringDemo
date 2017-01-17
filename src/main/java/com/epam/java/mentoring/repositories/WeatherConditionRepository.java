package com.epam.java.mentoring.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.epam.java.mentoring.entities.WeatherCondition;
import com.epam.java.mentoring.model.RoadAccident;

@Repository
public interface WeatherConditionRepository extends CrudRepository<WeatherCondition, Integer> {
	Iterable<RoadAccident> findAccidentsByCode(String code);
}

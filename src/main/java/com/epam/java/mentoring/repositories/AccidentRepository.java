package com.epam.java.mentoring.repositories;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epam.java.mentoring.entities.Accident;
import com.epam.java.mentoring.entities.WeatherCondition;

public interface AccidentRepository extends JpaRepository<Accident, String> {

	Accident findOne(String accidentId);

	Collection<Accident> findByWeatherCondition(WeatherCondition condition);

}

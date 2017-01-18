package com.epam.java.mentoring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epam.java.mentoring.entities.Accident;
import com.epam.java.mentoring.entities.DistrictAuthority;
import com.epam.java.mentoring.repositories.AccidentRepository;
import com.epam.java.mentoring.repositories.DistrictAuthorityRepository;

@Service
public class MySpringDemoServiceImpl implements MySpringDemoService {

	@Autowired
	private AccidentRepository accidentRepository;

	@Autowired
	private DistrictAuthorityRepository districtAuthorityRepository;

	@Override
	public Accident findAccidentByIndex(String accidentId) {

		return accidentRepository.findOne(accidentId);
	}

	public DistrictAuthority findDistrictAuthority(Integer code) {
		DistrictAuthority districtAuthority = districtAuthorityRepository.findByCode(code);
		return districtAuthority;
	}

}

package com.epam.java.mentoring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epam.java.mentoring.entities.DistrictAuthority;

public interface DistrictAuthorityRepository extends JpaRepository<DistrictAuthority, Integer> {
	DistrictAuthority findByCode(Integer code);
}

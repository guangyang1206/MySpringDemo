package com.epam.java.mentoring.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.epam.java.mentoring.entities.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

	List<Customer> findByLastName(String lastName);
}

package com.sapient.customer.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sapient.customer.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

	Customer findById(String id);

	List<Customer> findAll();

	void deleteById(String id);

}

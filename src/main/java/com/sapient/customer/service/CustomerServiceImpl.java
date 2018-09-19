package com.sapient.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sapient.customer.model.Customer;
import com.sapient.customer.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerRepository;

	public List<Customer> getAllCustomers() {

		List<Customer> customers = customerRepository.findAll();
		return customers;

	}

	public Customer getCustomerById(String id) {

		Customer customer = customerRepository.findById(id);
		return customer;

	}

	public Customer createCustomer(Customer customer) {

		Customer new_customer = customerRepository.save(customer);
		return new_customer;

	}

	public Customer updateCustomer(String id, Customer customer) {

		Customer updateCustomer = customerRepository.findById(id);
		updateCustomer.setFirstName(customer.getFirstName());
		updateCustomer.setLastName(customer.getLastName());
		updateCustomer.setPhone(customer.getPhone());

		Customer updatedCustomer = customerRepository.save(updateCustomer);

		return updatedCustomer;

	}

	public void deleteCustomer(String id) {

		customerRepository.deleteById(id);

	}

}

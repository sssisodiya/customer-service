package com.sapient.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.customer.model.Customer;
import com.sapient.customer.service.CustomerService;

@RestController
@RequestMapping("/apis/v1/")
public class CustomerController {

	@Autowired
	CustomerService customerService;

	@RequestMapping(value = "/customers", method = RequestMethod.GET)
	public List<Customer> getAllCustomers() {

		List<Customer> customers = customerService.getAllCustomers();
		return customers;
	}

	@RequestMapping(value = "/customers/{customerId}", method = RequestMethod.GET)
	public Customer getCustomerById(@PathVariable String customerId) {

		Customer customer = customerService.getCustomerById(customerId);
		return customer;
	}

	@RequestMapping(value = "/customers", method = RequestMethod.POST)
	public Customer createCustomer(@RequestBody Customer customer) {

		Customer createdCustomer = customerService.createCustomer(customer);
		return createdCustomer;

	}

	@RequestMapping(value = "/customers/{customerId}", method = RequestMethod.PUT)
	public Customer updateCustomer(@PathVariable String customerId, @RequestBody Customer customer) {

		Customer updatedCustomer = customerService.updateCustomer(customerId, customer);
		return updatedCustomer;

	}

	@RequestMapping(value = "/customers/{customerId}", method = RequestMethod.DELETE)
	public void deleteCustomerById(@PathVariable String customerId) {

		customerService.deleteCustomer(customerId);

	}

}

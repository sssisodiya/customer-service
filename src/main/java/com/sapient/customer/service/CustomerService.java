package com.sapient.customer.service;

import java.util.List;

import com.sapient.customer.model.Customer;

public interface CustomerService {

	public List<Customer> getAllCustomers();

	public Customer getCustomerById(String id);

	public Customer createCustomer(Customer customer);

	public Customer updateCustomer(String id, Customer customer);

	public void deleteCustomer(String id);
}

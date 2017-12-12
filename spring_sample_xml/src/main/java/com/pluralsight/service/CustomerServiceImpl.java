package com.pluralsight.service;

import java.util.List;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository;

	@Override
	public List<Customer> findall() {

		return customerRepository.findAll();

	}

	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
}

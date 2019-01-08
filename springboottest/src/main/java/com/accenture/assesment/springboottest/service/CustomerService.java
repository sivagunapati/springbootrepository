package com.accenture.assesment.springboottest.service;

import com.accenture.assesment.springboottest.entity.Customer;
import com.accenture.assesment.springboottest.model.CustomerDto;

public interface CustomerService {
	
	public Customer getCustomer(String custName);
	public CustomerDto getCustomerById(Integer custId);
	public Customer createCustomer(CustomerDto customer);

}

package com.accenture.assesment.springboottest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.accenture.assesment.springboottest.entity.BusinessProblem;
import com.accenture.assesment.springboottest.entity.Customer;


@org.springframework.stereotype.Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
	
	List<Customer> findByCustomerName(String customername);
	List<Customer> findByCustId(Integer custid);
	List<Customer> findByBusinessProblem(BusinessProblem businessproblem);
	
	@Query(value="select * from Customer c where c.custId = 1", nativeQuery = true)
	public Customer  findcustomerbyId();
	
	
	
	
}
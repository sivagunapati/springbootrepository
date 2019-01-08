package com.accenture.assesment.springboottest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.accenture.assesment.springboottest.entity.BusinessProblem;


public interface BusinessProblemRepository extends JpaRepository<BusinessProblem, Integer> {

	List<BusinessProblem> findByProblemId(int problemid);
    
}

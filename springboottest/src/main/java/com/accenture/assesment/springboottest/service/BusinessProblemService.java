package com.accenture.assesment.springboottest.service;

import java.util.List;

import com.accenture.assesment.springboottest.entity.BusinessProblem;
import com.accenture.assesment.springboottest.entity.Features;
import com.accenture.assesment.springboottest.model.BusinessProblemModel;
import com.accenture.assesment.springboottest.model.Feature;

public interface BusinessProblemService {
	
	public BusinessProblem getProblem(int problemId);
	public BusinessProblem createBusinessProblem(BusinessProblemModel businessProblem);
	public List<Features> createFeature(Integer problemId, Feature feature);

}

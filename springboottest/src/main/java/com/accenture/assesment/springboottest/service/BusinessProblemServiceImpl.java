package com.accenture.assesment.springboottest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accenture.assesment.springboottest.entity.BusinessProblem;
import com.accenture.assesment.springboottest.entity.Customer;
import com.accenture.assesment.springboottest.entity.Features;
import com.accenture.assesment.springboottest.model.BusinessProblemModel;
import com.accenture.assesment.springboottest.model.CustomerModel;
import com.accenture.assesment.springboottest.model.Feature;
import com.accenture.assesment.springboottest.repository.BusinessProblemRepository;
import com.accenture.assesment.springboottest.repository.FeaturesRepository;

@Service
public class BusinessProblemServiceImpl implements BusinessProblemService {
	
	@Autowired
    private BusinessProblemRepository businessProblemRepository;
	
	@Autowired
    private FeaturesRepository featuresRepository;

	@Override
	public BusinessProblem getProblem(int problemId) {
		List<BusinessProblem> businessProblems =  businessProblemRepository.findByProblemId(problemId);
		return businessProblems.get(0);
	}

	@Override
	public BusinessProblem createBusinessProblem(BusinessProblemModel businessProblemModel) {
		
		BusinessProblem businessProblem = new BusinessProblem();
		Customer customer = new Customer();
		List<Customer> custList = new ArrayList<>();
		businessProblem.setProblemName(businessProblemModel.getProblemName());
		businessProblem.setProblemType(businessProblemModel.getProblemType());
		
		for (CustomerModel customerModel : businessProblemModel.getCustomerModeList()) {
			
			customer.setActive(customerModel.getActive());
			customer.setCustomerName(customerModel.getCustomerName());
			customer.setBusinessProblem(businessProblem);
			customer.setCountry(customerModel.getCountry());
			customer.setEmailAddress(customerModel.getEmailAddress());
			customer.setLanguage(customerModel.getLanguage());
			customer.setMobileNumber(customerModel.getMobileNumber());
			customer.setPhoneNumber(customerModel.getPhoneNumber());
			customer.setState(customerModel.getState());
			
			custList.add(customer);
			
		}
		businessProblem.setCustomers(custList);
		return businessProblemRepository.save(businessProblem);
		
	}

	@Override
	public List<Features> createFeature(Integer problemId, Feature feature) {
		
		List<BusinessProblem> businessProblems =  businessProblemRepository.findByProblemId(problemId);
		
		Features features = new Features();
		features.setFeatureDescription(feature.getFeatureDescription());
		features.setFeatureType(feature.getFeatureType());
		features.setBusinessProblems(businessProblems);
		
		List<Features> featuresList = new ArrayList<>();
		featuresList.add(features);
		
		return featuresRepository.saveAll(featuresList);
	}
	

}

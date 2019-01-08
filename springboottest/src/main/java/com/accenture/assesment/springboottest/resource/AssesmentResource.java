package com.accenture.assesment.springboottest.resource;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.assesment.springboottest.entity.BusinessProblem;
import com.accenture.assesment.springboottest.entity.Customer;
import com.accenture.assesment.springboottest.entity.Features;
import com.accenture.assesment.springboottest.model.BusinessProblemModel;
import com.accenture.assesment.springboottest.model.Cloud;
import com.accenture.assesment.springboottest.model.CustomerDto;
import com.accenture.assesment.springboottest.model.Feature;
import com.accenture.assesment.springboottest.service.BusinessProblemService;
import com.accenture.assesment.springboottest.service.CustomerService;
import com.accenture.assesment.springboottest.service.FeatureService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RequestMapping("/rest")
@RestController
@Api(value = "AssesmentResource")
public class AssesmentResource {
	
	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private BusinessProblemService businessProblemService;
	
	@Autowired
	private FeatureService featureService;

    @GetMapping("/all")
    public String hello() {
        return "Hello Youtube";
    }

    @PreAuthorize("hasAnyRole('ADMIN')")
    @GetMapping("/secured/all")
    public String securedHello() {
        return "Secured Hello";
    }

    @GetMapping("/secured/alternate")
    public String alternate() {
        return "alternate";
    }
    
    @ApiOperation(value = "Get Customer Details BY Name")
    @PreAuthorize("hasAnyRole('ADMIN')")
    @GetMapping(value="secured/customername/{customerName}")
	public Customer getCustomer(@PathVariable("customerName") String customerName) {
		return customerService.getCustomer(customerName);
	}
    
    @ApiOperation(value = "Get Customer Details")
    @PreAuthorize("hasAnyRole('ADMIN')")
    @GetMapping(value="secured/customer/{customerId}")
   	public CustomerDto getCustomerById(@PathVariable("customerId") Integer customerId) {
   		return customerService.getCustomerById(customerId);
   	}
    
    @ApiOperation(value = "Get Problem Details")
    @PreAuthorize("hasAnyRole('ADMIN')")
    @GetMapping(value="secured/problem/{problemId}")
   	public BusinessProblem getProblem(@PathVariable("problemId") int problemId) {
   		return businessProblemService.getProblem(problemId);
   	}
    
    @ApiOperation(value = "Create A Proiblem")
    @PreAuthorize("hasAnyRole('ADMIN')")
    @PostMapping("secured/Problem/createProplem")
    public BusinessProblem createBusinessProblem(@Valid @RequestBody BusinessProblemModel businessProblem) {
    	return businessProblemService.createBusinessProblem(businessProblem);
    	
    }
    
    @ApiOperation(value = "Create A Customer")
    @PreAuthorize("hasAnyRole('ADMIN')")
    @PostMapping("secured/customer/createcusomer")
    public Customer createcustomer(@Valid @RequestBody CustomerDto customerDto) {
    	return customerService.createCustomer(customerDto);
    }
    
    @ApiOperation(value = "Create A Feature")
    @PreAuthorize("hasAnyRole('ADMIN')")
    @PostMapping("secured/feature/{problemId}")
    public List<Features> createFeatures(@PathVariable (value = "problemId") Integer problemId, @Valid @RequestBody Feature feature) {
    	return businessProblemService.createFeature(problemId, feature);
    }
    
    @ApiOperation(value = "Get Feature Details")
    @PreAuthorize("hasAnyRole('ADMIN')")
    @GetMapping(value="secured/clouds/{featureId}")
   	public List<Cloud> getfeatures(@PathVariable("featureId") int featureId) {
   		return featureService.getFeatures(featureId);
   	}
    

    
}

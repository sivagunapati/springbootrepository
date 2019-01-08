package com.accenture.assesment.springboottest.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;

import com.accenture.assesment.springboottest.model.Cloud;


@Service
public class FeatureServiceImpl implements FeatureService {
	
	@PersistenceContext
	private EntityManager manager;

	@Override
	public List<Cloud> getFeatures(int featrureId) {
		return manager.createNamedQuery("getCloudFeatures", Cloud.class).setParameter(1, featrureId).getResultList();
	}

}

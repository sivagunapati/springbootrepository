package com.accenture.assesment.springboottest.service;

import java.util.List;

import com.accenture.assesment.springboottest.model.Cloud;

public interface FeatureService {
	public List<Cloud> getFeatures(int featrureId);
}

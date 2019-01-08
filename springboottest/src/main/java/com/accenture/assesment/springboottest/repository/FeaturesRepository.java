package com.accenture.assesment.springboottest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.accenture.assesment.springboottest.entity.Features;


public interface FeaturesRepository extends JpaRepository<Features, Integer>{
	
	List<Features> findByFeatrureId(Integer featrureid);

}

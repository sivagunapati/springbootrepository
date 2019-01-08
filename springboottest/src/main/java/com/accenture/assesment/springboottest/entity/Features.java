package com.accenture.assesment.springboottest.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "FEATURES")
@SqlResultSetMapping(name="ScheduleResult",
    classes={
      @ConstructorResult(
        targetClass=com.accenture.assesment.springboottest.model.Cloud.class,
        columns={
          @ColumnResult(name="awsFeature", type=String.class),
          @ColumnResult(name="predixFeature", type=String.class)
          })})

@NamedNativeQueries({
    @NamedNativeQuery(
            name    =   "getCloudFeatures",
            query   =   "SELECT a.AWSFEATURE, p.PREDIXFEATURE FROM AWS_CLOUD a JOIN FEATURES f on a.FEATURETYPE = f.FEATURETYPE JOIN PREDIX_CLOUD p ON p.FEATURETYPE = f.FEATURETYPE where f.FEATUREID= ?",
            resultSetMapping = "ScheduleResult"
    )
})
public class Features {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FEATUREID")
    private Integer featrureId;
	
    @Column(name = "FEATUREDESCRIPTION")
    private String featureDescription;
    
    @Column(name = "FEATURETYPE")
    private String featureType;
    
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "problem_feature", joinColumns = @JoinColumn(name = "feature_id", referencedColumnName = "FEATUREID"), inverseJoinColumns = @JoinColumn(name = "businessproblem_id", referencedColumnName = "PROBLEMID"))
    @JsonIgnore
    private List<BusinessProblem> businessProblems;

    public Features() {
    	
    }
    
	public Features(Integer featrureId, String featureDescription, String featureType,
			List<BusinessProblem> businessProblems) {
		super();
		this.featrureId = featrureId;
		this.featureDescription = featureDescription;
		this.featureType = featureType;
		this.businessProblems = businessProblems;
	}

	public Integer getFeatrureId() {
		return featrureId;
	}

	public void setFeatrureId(Integer featrureId) {
		this.featrureId = featrureId;
	}

	public String getFeatureDescription() {
		return featureDescription;
	}

	public void setFeatureDescription(String featureDescription) {
		this.featureDescription = featureDescription;
	}

	public String getFeatureType() {
		return featureType;
	}

	public void setFeatureType(String featureType) {
		this.featureType = featureType;
	}

	public List<BusinessProblem> getBusinessProblems() {
		return businessProblems;
	}

	public void setBusinessProblems(List<BusinessProblem> businessProblems) {
		this.businessProblems = businessProblems;
	}


}

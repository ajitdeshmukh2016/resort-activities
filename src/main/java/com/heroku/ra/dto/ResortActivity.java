package com.heroku.ra.dto;
import java.util.Date;

import com.heroku.ra.entities.PropertyC;
import com.heroku.ra.entities.ResortActivityC;

public class ResortActivity
{    
	private Integer    id           ;
    private Boolean    requireSignup ;
    private Double     signups     ;
    private String     name         ;
    private String     sfid         ;
    private Double     waitlistedSignups ;
    private Date       activityDate ;
    private Date       activityStart ;
    private Date       systemmodstamp ;
    private String     subcategory ;
    private String     category    ;
    private Double     eligibleSignups ;
    private String     location    ;
    private Boolean    isdeleted    ;
    private String     age         ;
    private String     longDescription;
    private Boolean    waitlistAvailable ;
    private String     activityIconUrl ;
    private String     shortDescription;
    private Double     capacity    ;
    private Double     cost        ;
    private String     activityBackgroundImageUrl ;
    private Date       createddate  ;
    private Date       lastmodifieddate ;
    private Date       lastactivitydate ;
    private Date       activityEndC ;
    private String     hcLastop     ;
    private PropertyC  property    ;

    public ResortActivity()
    {
		super();
    }

	public ResortActivity(ResortActivityC a) {
		super();
		this.id = a.getId();
		this.requireSignup = a.getRequireSignupC();
		this.signups = a.getSignupsC();
		this.name = a.getName();
		this.sfid = a.getSfid();
		this.waitlistedSignups = a.getWaitlistedSignupsC();
		this.activityDate = a.getActivityDateC();
		this.activityStart = a.getActivityStartC();
		this.systemmodstamp = a.getSystemmodstamp();
		this.subcategory = a.getSubcategoryC();
		this.category = a.getCategoryC();
		this.eligibleSignups = a.getEligibleSignupsC();
		this.location = a.getLocationC();
		this.isdeleted = a.getIsdeleted();

		this.age = a.getAgeC();
		this.longDescription = a.getLongDescriptionC();
		this.waitlistAvailable = a.getWaitlistAvailableC();
		this.activityIconUrl = a.getActivityIconUrlC();
		this.shortDescription = a.getShortDescriptionC();
		this.capacity = a.getCapacityC();
		this.cost = a.getCostC();
		this.activityBackgroundImageUrl = a.getActivityBackgroundImageUrlC();
		this.createddate = a.getCreateddate();
		this.lastmodifieddate = a.getLastmodifieddate();
		this.lastactivitydate = a.getLastactivitydate();
		this.activityEndC = a.getActivityEndC();
		this.property = getPropertyItem(a.getPropertyC());
	}

    private PropertyC getPropertyItem(String propertyC) {
    	
		return null;
	}

	//----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------
    public void setId( Integer id )
    {
        this.id = id ;
    }
    public Integer getId()
    {
        return this.id;
    }

	public Boolean getRequireSignup() {
		return requireSignup;
	}

	public void setRequireSignup(Boolean requireSignup) {
		this.requireSignup = requireSignup;
	}

	public Double getSignups() {
		return signups;
	}

	public void setSignups(Double signups) {
		this.signups = signups;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSfid() {
		return sfid;
	}

	public void setSfid(String sfid) {
		this.sfid = sfid;
	}

	public Double getWaitlistedSignups() {
		return waitlistedSignups;
	}

	public void setWaitlistedSignups(Double waitlistedSignups) {
		this.waitlistedSignups = waitlistedSignups;
	}

	public Date getActivityDate() {
		return activityDate;
	}

	public void setActivityDate(Date activityDate) {
		this.activityDate = activityDate;
	}

	public Date getActivityStart() {
		return activityStart;
	}

	public void setActivityStart(Date activityStart) {
		this.activityStart = activityStart;
	}

	public Date getSystemmodstamp() {
		return systemmodstamp;
	}

	public void setSystemmodstamp(Date systemmodstamp) {
		this.systemmodstamp = systemmodstamp;
	}

	public String getSubcategory() {
		return subcategory;
	}

	public void setSubcategory(String subcategory) {
		this.subcategory = subcategory;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Double getEligibleSignups() {
		return eligibleSignups;
	}

	public void setEligibleSignups(Double eligibleSignups) {
		this.eligibleSignups = eligibleSignups;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Boolean getIsdeleted() {
		return isdeleted;
	}

	public void setIsdeleted(Boolean isdeleted) {
		this.isdeleted = isdeleted;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	public Boolean getWaitlistAvailable() {
		return waitlistAvailable;
	}

	public void setWaitlistAvailable(Boolean waitlistAvailable) {
		this.waitlistAvailable = waitlistAvailable;
	}

	public String getActivityIconUrl() {
		return activityIconUrl;
	}

	public void setActivityIconUrl(String activityIconUrl) {
		this.activityIconUrl = activityIconUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public Double getCapacity() {
		return capacity;
	}

	public void setCapacity(Double capacity) {
		this.capacity = capacity;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public String getActivityBackgroundImageUrl() {
		return activityBackgroundImageUrl;
	}

	public void setActivityBackgroundImageUrl(String activityBackgroundImageUrl) {
		this.activityBackgroundImageUrl = activityBackgroundImageUrl;
	}

	public Date getCreateddate() {
		return createddate;
	}

	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}

	public Date getLastmodifieddate() {
		return lastmodifieddate;
	}

	public void setLastmodifieddate(Date lastmodifieddate) {
		this.lastmodifieddate = lastmodifieddate;
	}

	public Date getLastactivitydate() {
		return lastactivitydate;
	}

	public void setLastactivitydate(Date lastactivitydate) {
		this.lastactivitydate = lastactivitydate;
	}

	public Date getActivityEndC() {
		return activityEndC;
	}

	public void setActivityEndC(Date activityEndC) {
		this.activityEndC = activityEndC;
	}

	public String getHcLastop() {
		return hcLastop;
	}

	public void setHcLastop(String hcLastop) {
		this.hcLastop = hcLastop;
	}

	public PropertyC getProperty() {
		return property;
	}

	public void setProperty(PropertyC property) {
		this.property = property;
	}

}
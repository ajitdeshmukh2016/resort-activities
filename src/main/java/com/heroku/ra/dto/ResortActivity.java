package com.heroku.ra.dto;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.heroku.ra.entities.PropertyC;
import com.heroku.ra.entities.ResortActivityC;
import com.heroku.ra.model.JsonDateTime;
import com.heroku.ra.util.json.JsonDateTimeSerializer;

public class ResortActivity implements Serializable
{    
	
	private static final long serialVersionUID = -1967739822179358207L;

	private Integer    id           ;
    private Boolean    require_signup ;
    private Double     signups     ;
    private String     name         ;
    private String     subject      ;
    private String     sfid         ;
    private Double     waitlisted_signups ;
	
    @JsonSerialize(using = JsonDateTimeSerializer.class)
    @Temporal(TemporalType.TIMESTAMP)
    private Date       activity_date ;

	@JsonSerialize(using = JsonDateTimeSerializer.class)
    @Temporal(TemporalType.TIMESTAMP)
    private Date       activity_start ;

	private String     subcategory ;
    private String     category    ;
    private Double     eligible_signups ;
    private String     location    ;
    private String     age         ;
    private String     description;
    private Boolean    waitlist_available ;
    private String     icon ;
    private String     short_description;
    private Double     capacity    ;
    private Double     cost        ;
    private String     background_image ;

    @JsonSerialize(using = JsonDateTimeSerializer.class)
    @Temporal(TemporalType.TIMESTAMP)
    private Date       activity_end ;

    private Property  property    ;
    private JsonDateTime date;

    public ResortActivity()
    {
		super();
    }

	public ResortActivity(ResortActivityC a) {
		super();
		this.id = a.getId();
		this.require_signup = a.getRequireSignupC();
		this.signups = a.getSignupsC();
		this.name = a.getName();
		this.sfid = a.getSfid();
		this.waitlisted_signups = a.getWaitlistedSignupsC();
		this.activity_date = a.getActivityDateC();
		this.activity_start = a.getActivityStartC();
		this.subcategory = a.getSubcategoryC();
		this.category = a.getCategoryC();
		this.eligible_signups = a.getEligibleSignupsC();
		this.location = a.getLocationC();
		this.subject = a.getSubject();
		this.age = a.getAgeC();
		this.description = a.getLongDescriptionC();
		this.waitlist_available = a.getWaitlistAvailableC();
		this.icon = a.getActivityIconUrlC();
		this.short_description = a.getShortDescriptionC();
		this.capacity = a.getCapacityC();
		this.cost = a.getCostC();
		this.background_image = a.getActivityBackgroundImageUrlC();
		this.activity_end = a.getActivityEndC();
		this.setDate(a.getDate());
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
		return require_signup;
	}

	public void setRequireSignup(Boolean requireSignup) {
		this.require_signup = requireSignup;
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
		return waitlisted_signups;
	}

	public void setWaitlistedSignups(Double waitlistedSignups) {
		this.waitlisted_signups = waitlistedSignups;
	}

	public Date getActivityDate() {
		return activity_date;
	}

	public void setActivityDate(Date activityDate) {
		this.activity_date = activityDate;
	}

	public Date getActivityStart() {
		return activity_start;
	}

	public void setActivityStart(Date activityStart) {
		this.activity_start = activityStart;
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
		return eligible_signups;
	}

	public void setEligibleSignups(Double eligibleSignups) {
		this.eligible_signups = eligibleSignups;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getLongDescription() {
		return description;
	}

	public void setLongDescription(String longDescription) {
		this.description = longDescription;
	}

	public Boolean getWaitlistAvailable() {
		return waitlist_available;
	}

	public void setWaitlistAvailable(Boolean waitlistAvailable) {
		this.waitlist_available = waitlistAvailable;
	}

	public String getActivityIconUrl() {
		return icon;
	}

	public void setActivityIconUrl(String activityIconUrl) {
		this.icon = activityIconUrl;
	}

	public String getShortDescription() {
		return short_description;
	}

	public void setShortDescription(String shortDescription) {
		this.short_description = shortDescription;
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
		return background_image;
	}

	public void setActivityBackgroundImageUrl(String activityBackgroundImageUrl) {
		this.background_image = activityBackgroundImageUrl;
	}

	public Date getActivityEndC() {
		return activity_end;
	}

	public void setActivityEndC(Date activityEndC) {
		this.activity_end = activityEndC;
	}

	public Property getProperty() {
		return property;
	}

	public void setProperty(PropertyC property) {
		this.property = new Property(property);
	}

	public void setProperty(Property property) {
		this.property = property;
	}

	public JsonDateTime getDate() {
		return date;
	}

	public void setDate(JsonDateTime date) {
		this.date = date;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

}
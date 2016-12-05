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
		this.date = a.getDate();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean getRequire_signup() {
		return require_signup;
	}

	public void setRequire_signup(Boolean require_signup) {
		this.require_signup = require_signup;
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

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getSfid() {
		return sfid;
	}

	public void setSfid(String sfid) {
		this.sfid = sfid;
	}

	public Double getWaitlisted_signups() {
		return waitlisted_signups;
	}

	public void setWaitlisted_signups(Double waitlisted_signups) {
		this.waitlisted_signups = waitlisted_signups;
	}

	public Date getActivity_date() {
		return activity_date;
	}

	public void setActivity_date(Date activity_date) {
		this.activity_date = activity_date;
	}

	public Date getActivity_start() {
		return activity_start;
	}

	public void setActivity_start(Date activity_start) {
		this.activity_start = activity_start;
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

	public Double getEligible_signups() {
		return eligible_signups;
	}

	public void setEligible_signups(Double eligible_signups) {
		this.eligible_signups = eligible_signups;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getWaitlist_available() {
		return waitlist_available;
	}

	public void setWaitlist_available(Boolean waitlist_available) {
		this.waitlist_available = waitlist_available;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getShort_description() {
		return short_description;
	}

	public void setShort_description(String short_description) {
		this.short_description = short_description;
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

	public String getBackground_image() {
		return background_image;
	}

	public void setBackground_image(String background_image) {
		this.background_image = background_image;
	}

	public Date getActivity_end() {
		return activity_end;
	}

	public void setActivity_end(Date activity_end) {
		this.activity_end = activity_end;
	}

	public Property getProperty() {
		return property;
	}

	public void setProperty(Property property) {
		this.property = property;
	}

	public void setProperty(PropertyC property) {
		this.property = new Property( property );
	}

	public JsonDateTime getDate() {
		return date;
	}

	public void setDate(JsonDateTime date) {
		this.date = date;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
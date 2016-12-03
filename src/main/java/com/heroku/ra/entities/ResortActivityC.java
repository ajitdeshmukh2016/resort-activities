/*
 * Created on 3 Dec 2016 ( Time 12:00:39 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
// This Bean has a basic Primary Key (not composite) 

package com.heroku.ra.entities;

import java.io.Serializable;

//import javax.validation.constraints.* ;
//import org.hibernate.validator.constraints.* ;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.heroku.ra.model.JsonDateTime;
import com.heroku.ra.util.json.JsonDateTimeSerializer;

/**
 * Persistent class for entity stored in table "resort_activity__c"
 *
 * @author Telosys Tools Generator
 *
 */

@Entity
@Table(name="resort_activity__c", schema="salesforce" )
// Define named queries here
@NamedQueries ( {
  @NamedQuery ( name="ResortActivityC.countAll", query="SELECT COUNT(x) FROM ResortActivityC x" )
} )
public class ResortActivityC implements Serializable
{
    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id", nullable=false)
    private Integer    id           ;


    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    @Column(name="require_signup__c")
    private Boolean    requireSignupC ;

    @Column(name="signups__c")
    private Double     signupsC     ;

    @Column(name="name", length=80)
    private String     name         ;

    @Column(name="sfid", length=18)
    private String     sfid         ;

    @Column(name="waitlisted_signups__c")
    private Double     waitlistedSignupsC ;

	@JsonSerialize(using = JsonDateTimeSerializer.class)
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="activity_date__c")
    private Date       activityDateC ;

	@JsonSerialize(using = JsonDateTimeSerializer.class)
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="activity_start__c")
    private Date       activityStartC ;

	@JsonSerialize(using = JsonDateTimeSerializer.class)
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="systemmodstamp")
    private Date       systemmodstamp ;

    @Column(name="subcategory__c", length=255)
    private String     subcategoryC ;

    @Column(name="category__c", length=255)
    private String     categoryC    ;

    @Column(name="eligible_signups__c")
    private Double     eligibleSignupsC ;

    @Column(name="location__c", length=150)
    private String     locationC    ;

    @Column(name="isdeleted")
    private Boolean    isdeleted    ;

    @Column(name="_hc_err", length=2147483647)
    private String     hcErr        ;

    @Column(name="age__c", length=255)
    private String     ageC         ;

    @Column(name="long_description__c", length=2147483647)
    private String     longDescriptionC ;

    @Column(name="waitlist_available__c")
    private Boolean    waitlistAvailableC ;

    @Column(name="activity_icon_url__c", length=255)
    private String     activityIconUrlC ;

    @Column(name="short_description__c", length=200)
    private String     shortDescriptionC ;

    @Column(name="capacity__c")
    private Double     capacityC    ;

    @Column(name="cost__c")
    private Double     costC        ;

    @Column(name="activity_background_image_url__c", length=255)
    private String     activityBackgroundImageUrlC ;

	@JsonSerialize(using = JsonDateTimeSerializer.class)
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="createddate")
    private Date       createddate  ;

	@JsonSerialize(using = JsonDateTimeSerializer.class)
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="lastmodifieddate")
    private Date       lastmodifieddate ;

	@JsonSerialize(using = JsonDateTimeSerializer.class)
    @Temporal(TemporalType.DATE)
    @Column(name="lastactivitydate")
    private Date       lastactivitydate ;

	@JsonSerialize(using = JsonDateTimeSerializer.class)
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="activity_end__c")
    private Date       activityEndC ;

    @Column(name="_hc_lastop", length=32)
    private String     hcLastop     ;

    @Column(name="property__c", length=18)
    private String     propertyC    ;

    @Transient
    private JsonDateTime date;

    //----------------------------------------------------------------------
    // ENTITY LINKS ( RELATIONSHIP )
    //----------------------------------------------------------------------

    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public ResortActivityC()
    {
		super();
    }

    public ResortActivityC update(ResortActivityC a) {
		this.id = a.id;
        this.requireSignupC = a.requireSignupC;
        this.signupsC = a.signupsC;
        this.name = a.name;
        this.sfid = a.sfid;
        this.waitlistedSignupsC = a.waitlistedSignupsC;
        this.activityDateC = a.activityDateC;
        this.activityStartC = a.activityStartC;
        this.systemmodstamp = a.systemmodstamp;
        this.subcategoryC = a.subcategoryC;
        this.categoryC = a.categoryC;
        this.eligibleSignupsC = a.eligibleSignupsC;
        this.locationC = a.locationC;
        this.isdeleted = a.isdeleted;
        this.hcErr = a.hcErr;
        this.ageC = a.ageC;
        this.longDescriptionC = a.longDescriptionC;
        this.waitlistAvailableC = a.waitlistAvailableC;
        this.activityIconUrlC = a.activityIconUrlC;
        this.shortDescriptionC = a.shortDescriptionC;
        this.capacityC = a.capacityC;
        this.costC = a.costC;
        this.activityBackgroundImageUrlC = a.activityBackgroundImageUrlC;
        this.createddate = a.createddate;
        this.lastmodifieddate = a.lastmodifieddate;
        this.lastactivitydate = a.lastactivitydate;
        this.activityEndC = a.activityEndC;
        this.hcLastop = a.hcLastop;
        this.propertyC = a.propertyC;



		return a;
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

    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
    //--- DATABASE MAPPING : require_signup__c ( bool ) 
    public void setRequireSignupC( Boolean requireSignupC )
    {
        this.requireSignupC = requireSignupC;
    }
    public Boolean getRequireSignupC()
    {
        return this.requireSignupC;
    }

    //--- DATABASE MAPPING : signups__c ( float8 ) 
    public void setSignupsC( Double signupsC )
    {
        this.signupsC = signupsC;
    }
    @JsonProperty("signups")
    public Double getSignupsC()
    {
        return this.signupsC;
    }

    //--- DATABASE MAPPING : name ( varchar ) 
    public void setName( String name )
    {
        this.name = name;
    }
    public String getName()
    {
        return this.name;
    }

    @JsonProperty("subject")
    public String getSubject()
    {
        return this.name;
    }
    //--- DATABASE MAPPING : sfid ( varchar ) 
    public void setSfid( String sfid )
    {
        this.sfid = sfid;
    }
    public String getSfid()
    {
        return this.sfid;
    }

    //--- DATABASE MAPPING : waitlisted_signups__c ( float8 ) 
    public void setWaitlistedSignupsC( Double waitlistedSignupsC )
    {
        this.waitlistedSignupsC = waitlistedSignupsC;
    }
    public Double getWaitlistedSignupsC()
    {
        return this.waitlistedSignupsC;
    }

    //--- DATABASE MAPPING : activity_date__c ( timestamp ) 
    public void setActivityDateC( Date activityDateC )
    {
        this.activityDateC = activityDateC;
    }
    public Date getActivityDateC()
    {
        return this.activityDateC;
    }

    //--- DATABASE MAPPING : activity_start__c ( timestamp ) 
    public void setActivityStartC( Date activityStartC )
    {
        this.activityStartC = activityStartC;
    }

    @JsonSerialize()
    public JsonDateTime getDate(){
    	return new JsonDateTime (activityStartC);
    }
    
    public Date getActivityStartC()
    {
        return this.activityStartC;
    }

    //--- DATABASE MAPPING : systemmodstamp ( timestamp ) 
    public void setSystemmodstamp( Date systemmodstamp )
    {
        this.systemmodstamp = systemmodstamp;
    }
    public Date getSystemmodstamp()
    {
        return this.systemmodstamp;
    }

    //--- DATABASE MAPPING : subcategory__c ( varchar ) 
    public void setSubcategoryC( String subcategoryC )
    {
        this.subcategoryC = subcategoryC;
    }
    @JsonProperty("subcategory")
    public String getSubcategoryC()
    {
        return this.subcategoryC;
    }

    //--- DATABASE MAPPING : category__c ( varchar ) 
    public void setCategoryC( String categoryC )
    {
        this.categoryC = categoryC;
    }
    @JsonProperty("category")
    public String getCategoryC()
    {
        return this.categoryC;
    }

    //--- DATABASE MAPPING : eligible_signups__c ( float8 ) 
    public void setEligibleSignupsC( Double eligibleSignupsC )
    {
        this.eligibleSignupsC = eligibleSignupsC;
    }
    public Double getEligibleSignupsC()
    {
        return this.eligibleSignupsC;
    }

    //--- DATABASE MAPPING : location__c ( varchar ) 
    public void setLocationC( String locationC )
    {
        this.locationC = locationC;
    }
    
    @JsonProperty("location")
    public String getLocationC()
    {
        return this.locationC;
    }

    //--- DATABASE MAPPING : isdeleted ( bool ) 
    public void setIsdeleted( Boolean isdeleted )
    {
        this.isdeleted = isdeleted;
    }
    public Boolean getIsdeleted()
    {
        return this.isdeleted;
    }

    //--- DATABASE MAPPING : _hc_err ( text ) 
    public void setHcErr( String hcErr )
    {
        this.hcErr = hcErr;
    }
    public String getHcErr()
    {
        return this.hcErr;
    }

    //--- DATABASE MAPPING : age__c ( varchar ) 
    public void setAgeC( String ageC )
    {
        this.ageC = ageC;
    }
    
    @JsonProperty("age")
    public String getAgeC()
    {
        return this.ageC;
    }

    //--- DATABASE MAPPING : long_description__c ( text ) 
    public void setLongDescriptionC( String longDescriptionC )
    {
        this.longDescriptionC = longDescriptionC;
    }
    
    
    @JsonProperty("description")
    public String getLongDescriptionC()
    {
        return this.longDescriptionC;
    }

    //--- DATABASE MAPPING : waitlist_available__c ( bool ) 
    public void setWaitlistAvailableC( Boolean waitlistAvailableC )
    {
        this.waitlistAvailableC = waitlistAvailableC;
    }
    public Boolean getWaitlistAvailableC()
    {
        return this.waitlistAvailableC;
    }

    //--- DATABASE MAPPING : activity_icon_url__c ( varchar ) 
    public void setActivityIconUrlC( String activityIconUrlC )
    {
        this.activityIconUrlC = activityIconUrlC;
    }
    public String getActivityIconUrlC()
    {
        return this.activityIconUrlC;
    }

    //--- DATABASE MAPPING : short_description__c ( varchar ) 
    public void setShortDescriptionC( String shortDescriptionC )
    {
        this.shortDescriptionC = shortDescriptionC;
    }
    @JsonProperty("short_description")
   public String getShortDescriptionC()
    {
        return this.shortDescriptionC;
    }

    //--- DATABASE MAPPING : capacity__c ( float8 ) 
    public void setCapacityC( Double capacityC )
    {
        this.capacityC = capacityC;
    }
    @JsonProperty("capacity")
    public Double getCapacityC()
    {
        return this.capacityC;
    }

    //--- DATABASE MAPPING : cost__c ( float8 ) 
    public void setCostC( Double costC )
    {
        this.costC = costC;
    }
    @JsonIgnore
    public Double getCostC()
    {
        return this.costC;
    }
    
    @JsonProperty("cost")
    public String getCost()
    {
    	String s = "Free";
    	
    	if (this.costC > 0)
    		s = this.costC.toString();
    	
        return s;
    }
    
    //--- DATABASE MAPPING : activity_background_image_url__c ( varchar ) 
    public void setActivityBackgroundImageUrlC( String activityBackgroundImageUrlC )
    {
        this.activityBackgroundImageUrlC = activityBackgroundImageUrlC;
    }
    public String getActivityBackgroundImageUrlC()
    {
        return this.activityBackgroundImageUrlC;
    }

    //--- DATABASE MAPPING : createddate ( timestamp ) 
    public void setCreateddate( Date createddate )
    {
        this.createddate = createddate;
    }
    public Date getCreateddate()
    {
        return this.createddate;
    }

    //--- DATABASE MAPPING : lastmodifieddate ( timestamp ) 
    public void setLastmodifieddate( Date lastmodifieddate )
    {
        this.lastmodifieddate = lastmodifieddate;
    }
    public Date getLastmodifieddate()
    {
        return this.lastmodifieddate;
    }

    //--- DATABASE MAPPING : lastactivitydate ( date ) 
    public void setLastactivitydate( Date lastactivitydate )
    {
        this.lastactivitydate = lastactivitydate;
    }
    public Date getLastactivitydate()
    {
        return this.lastactivitydate;
    }

    //--- DATABASE MAPPING : activity_end__c ( timestamp ) 
    public void setActivityEndC( Date activityEndC )
    {
        this.activityEndC = activityEndC;
    }
    public Date getActivityEndC()
    {
        return this.activityEndC;
    }

    //--- DATABASE MAPPING : _hc_lastop ( varchar ) 
    public void setHcLastop( String hcLastop )
    {
        this.hcLastop = hcLastop;
    }
    @JsonIgnore
    public String getHcLastop()
    {
        return this.hcLastop;
    }

    //--- DATABASE MAPPING : property__c ( varchar ) 
    public void setPropertyC( String propertyC )
    {
        this.propertyC = propertyC;
    }
    @JsonProperty("property")
    public String getPropertyC()
    {
        return this.propertyC;
    }


    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR LINKS
    //----------------------------------------------------------------------

    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append("["); 
        sb.append(id);
        sb.append("]:"); 
        sb.append(requireSignupC);
        sb.append("|");
        sb.append(signupsC);
        sb.append("|");
        sb.append(name);
        sb.append("|");
        sb.append(sfid);
        sb.append("|");
        sb.append(waitlistedSignupsC);
        sb.append("|");
        sb.append(activityDateC);
        sb.append("|");
        sb.append(activityStartC);
        sb.append("|");
        sb.append(systemmodstamp);
        sb.append("|");
        sb.append(subcategoryC);
        sb.append("|");
        sb.append(categoryC);
        sb.append("|");
        sb.append(eligibleSignupsC);
        sb.append("|");
        sb.append(locationC);
        sb.append("|");
        sb.append(isdeleted);
        sb.append("|");
        sb.append(hcErr);
        sb.append("|");
        sb.append(ageC);
        sb.append("|");
        sb.append(longDescriptionC);
        sb.append("|");
        sb.append(waitlistAvailableC);
        sb.append("|");
        sb.append(activityIconUrlC);
        sb.append("|");
        sb.append(shortDescriptionC);
        sb.append("|");
        sb.append(capacityC);
        sb.append("|");
        sb.append(costC);
        sb.append("|");
        sb.append(activityBackgroundImageUrlC);
        sb.append("|");
        sb.append(createddate);
        sb.append("|");
        sb.append(lastmodifieddate);
        sb.append("|");
        sb.append(lastactivitydate);
        sb.append("|");
        sb.append(activityEndC);
        sb.append("|");
        sb.append(hcLastop);
        sb.append("|");
        sb.append(propertyC);
        return sb.toString(); 
    } 

    
}
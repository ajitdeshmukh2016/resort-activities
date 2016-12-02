/*
 * Created on 2 Dec 2016 ( Time 16:47:10 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
// This Bean has a basic Primary Key (not composite) 

package com.heroku.ra.entities;

import java.io.Serializable;

//import javax.validation.constraints.* ;
//import org.hibernate.validator.constraints.* ;

import java.util.Date;

import javax.persistence.*;

/**
 * Persistent class for entity stored in table "account"
 *
 * @author Telosys Tools Generator
 *
 */

@Entity
@Table(name="account", schema="salesforce" )
// Define named queries here
@NamedQueries ( {
  @NamedQuery ( name="Account.countAll", query="SELECT COUNT(x) FROM Account x" )
} )
public class Account implements Serializable
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
    @Column(name="cleanstatus", length=40)
    private String     cleanstatus  ;

    @Column(name="type", length=40)
    private String     type         ;

    @Column(name="shippinglatitude")
    private Double     shippinglatitude ;

    @Column(name="description", length=2147483647)
    private String     description  ;

    @Column(name="numberofemployees")
    private Integer    numberofemployees ;

    @Column(name="accountsource", length=40)
    private String     accountsource ;

    @Column(name="shippingpostalcode", length=20)
    private String     shippingpostalcode ;

    @Column(name="createdbyid", length=18)
    private String     createdbyid  ;

    @Column(name="shippinggeocodeaccuracy", length=40)
    private String     shippinggeocodeaccuracy ;

    @Column(name="_hc_err", length=2147483647)
    private String     hcErr        ;

    @Column(name="shippingcity", length=40)
    private String     shippingcity ;

    @Column(name="sfid", length=18)
    private String     sfid         ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="lastreferenceddate")
    private Date       lastreferenceddate ;

    @Column(name="billinglongitude")
    private Double     billinglongitude ;

    @Column(name="phone", length=40)
    private String     phone        ;

    @Column(name="customerpriority__c", length=255)
    private String     customerpriorityC ;

    @Column(name="billingcity", length=40)
    private String     billingcity  ;

    @Column(name="shippingstate", length=80)
    private String     shippingstate ;

    @Column(name="shippinglongitude")
    private Double     shippinglongitude ;

    @Temporal(TemporalType.DATE)
    @Column(name="lastactivitydate")
    private Date       lastactivitydate ;

    @Column(name="billingpostalcode", length=20)
    private String     billingpostalcode ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="lastmodifieddate")
    private Date       lastmodifieddate ;

    @Column(name="billingcountry", length=80)
    private String     billingcountry ;

    @Column(name="active__c", length=255)
    private String     activeC      ;

    @Column(name="name", length=255)
    private String     name         ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="lastvieweddate")
    private Date       lastvieweddate ;

    @Column(name="_hc_lastop", length=32)
    private String     hcLastop     ;

    @Column(name="numberoflocations__c")
    private Double     numberoflocationsC ;

    @Column(name="isdeleted")
    private Boolean    isdeleted    ;

    @Column(name="fax", length=40)
    private String     fax          ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="systemmodstamp")
    private Date       systemmodstamp ;

    @Column(name="billinggeocodeaccuracy", length=40)
    private String     billinggeocodeaccuracy ;

    @Column(name="naicsdesc", length=120)
    private String     naicsdesc    ;

    @Column(name="photourl", length=255)
    private String     photourl     ;

    @Column(name="shippingstreet", length=255)
    private String     shippingstreet ;

    @Column(name="shippingcountry", length=80)
    private String     shippingcountry ;

    @Column(name="billingstreet", length=255)
    private String     billingstreet ;

    @Column(name="dunsnumber", length=9)
    private String     dunsnumber   ;

    @Column(name="yearstarted", length=4)
    private String     yearstarted  ;

    @Column(name="lastmodifiedbyid", length=18)
    private String     lastmodifiedbyid ;

    @Column(name="masterrecordid", length=18)
    private String     masterrecordid ;

    @Column(name="dandbcompanyid", length=18)
    private String     dandbcompanyid ;

    @Column(name="billingstate", length=80)
    private String     billingstate ;

    @Column(name="accountnumber", length=40)
    private String     accountnumber ;

    @Column(name="annualrevenue")
    private Double     annualrevenue ;

    @Column(name="billinglatitude")
    private Double     billinglatitude ;

    @Column(name="website", length=255)
    private String     website      ;

    @Column(name="naicscode", length=8)
    private String     naicscode    ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="createddate")
    private Date       createddate  ;



    //----------------------------------------------------------------------
    // ENTITY LINKS ( RELATIONSHIP )
    //----------------------------------------------------------------------

    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public Account()
    {
		super();
    }

        public Account update(Account a) {
		this.id = a.id;
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
    //--- DATABASE MAPPING : cleanstatus ( varchar ) 
    public void setCleanstatus( String cleanstatus )
    {
        this.cleanstatus = cleanstatus;
    }
    public String getCleanstatus()
    {
        return this.cleanstatus;
    }

    //--- DATABASE MAPPING : type ( varchar ) 
    public void setType( String type )
    {
        this.type = type;
    }
    public String getType()
    {
        return this.type;
    }

    //--- DATABASE MAPPING : shippinglatitude ( float8 ) 
    public void setShippinglatitude( Double shippinglatitude )
    {
        this.shippinglatitude = shippinglatitude;
    }
    public Double getShippinglatitude()
    {
        return this.shippinglatitude;
    }

    //--- DATABASE MAPPING : description ( text ) 
    public void setDescription( String description )
    {
        this.description = description;
    }
    public String getDescription()
    {
        return this.description;
    }

    //--- DATABASE MAPPING : numberofemployees ( int4 ) 
    public void setNumberofemployees( Integer numberofemployees )
    {
        this.numberofemployees = numberofemployees;
    }
    public Integer getNumberofemployees()
    {
        return this.numberofemployees;
    }

    //--- DATABASE MAPPING : accountsource ( varchar ) 
    public void setAccountsource( String accountsource )
    {
        this.accountsource = accountsource;
    }
    public String getAccountsource()
    {
        return this.accountsource;
    }

    //--- DATABASE MAPPING : shippingpostalcode ( varchar ) 
    public void setShippingpostalcode( String shippingpostalcode )
    {
        this.shippingpostalcode = shippingpostalcode;
    }
    public String getShippingpostalcode()
    {
        return this.shippingpostalcode;
    }

    //--- DATABASE MAPPING : createdbyid ( varchar ) 
    public void setCreatedbyid( String createdbyid )
    {
        this.createdbyid = createdbyid;
    }
    public String getCreatedbyid()
    {
        return this.createdbyid;
    }

    //--- DATABASE MAPPING : shippinggeocodeaccuracy ( varchar ) 
    public void setShippinggeocodeaccuracy( String shippinggeocodeaccuracy )
    {
        this.shippinggeocodeaccuracy = shippinggeocodeaccuracy;
    }
    public String getShippinggeocodeaccuracy()
    {
        return this.shippinggeocodeaccuracy;
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

    //--- DATABASE MAPPING : shippingcity ( varchar ) 
    public void setShippingcity( String shippingcity )
    {
        this.shippingcity = shippingcity;
    }
    public String getShippingcity()
    {
        return this.shippingcity;
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

    //--- DATABASE MAPPING : lastreferenceddate ( timestamp ) 
    public void setLastreferenceddate( Date lastreferenceddate )
    {
        this.lastreferenceddate = lastreferenceddate;
    }
    public Date getLastreferenceddate()
    {
        return this.lastreferenceddate;
    }

    //--- DATABASE MAPPING : billinglongitude ( float8 ) 
    public void setBillinglongitude( Double billinglongitude )
    {
        this.billinglongitude = billinglongitude;
    }
    public Double getBillinglongitude()
    {
        return this.billinglongitude;
    }

    //--- DATABASE MAPPING : phone ( varchar ) 
    public void setPhone( String phone )
    {
        this.phone = phone;
    }
    public String getPhone()
    {
        return this.phone;
    }

    //--- DATABASE MAPPING : customerpriority__c ( varchar ) 
    public void setCustomerpriorityC( String customerpriorityC )
    {
        this.customerpriorityC = customerpriorityC;
    }
    public String getCustomerpriorityC()
    {
        return this.customerpriorityC;
    }

    //--- DATABASE MAPPING : billingcity ( varchar ) 
    public void setBillingcity( String billingcity )
    {
        this.billingcity = billingcity;
    }
    public String getBillingcity()
    {
        return this.billingcity;
    }

    //--- DATABASE MAPPING : shippingstate ( varchar ) 
    public void setShippingstate( String shippingstate )
    {
        this.shippingstate = shippingstate;
    }
    public String getShippingstate()
    {
        return this.shippingstate;
    }

    //--- DATABASE MAPPING : shippinglongitude ( float8 ) 
    public void setShippinglongitude( Double shippinglongitude )
    {
        this.shippinglongitude = shippinglongitude;
    }
    public Double getShippinglongitude()
    {
        return this.shippinglongitude;
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

    //--- DATABASE MAPPING : billingpostalcode ( varchar ) 
    public void setBillingpostalcode( String billingpostalcode )
    {
        this.billingpostalcode = billingpostalcode;
    }
    public String getBillingpostalcode()
    {
        return this.billingpostalcode;
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

    //--- DATABASE MAPPING : billingcountry ( varchar ) 
    public void setBillingcountry( String billingcountry )
    {
        this.billingcountry = billingcountry;
    }
    public String getBillingcountry()
    {
        return this.billingcountry;
    }

    //--- DATABASE MAPPING : active__c ( varchar ) 
    public void setActiveC( String activeC )
    {
        this.activeC = activeC;
    }
    public String getActiveC()
    {
        return this.activeC;
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

    //--- DATABASE MAPPING : lastvieweddate ( timestamp ) 
    public void setLastvieweddate( Date lastvieweddate )
    {
        this.lastvieweddate = lastvieweddate;
    }
    public Date getLastvieweddate()
    {
        return this.lastvieweddate;
    }

    //--- DATABASE MAPPING : _hc_lastop ( varchar ) 
    public void setHcLastop( String hcLastop )
    {
        this.hcLastop = hcLastop;
    }
    public String getHcLastop()
    {
        return this.hcLastop;
    }

    //--- DATABASE MAPPING : numberoflocations__c ( float8 ) 
    public void setNumberoflocationsC( Double numberoflocationsC )
    {
        this.numberoflocationsC = numberoflocationsC;
    }
    public Double getNumberoflocationsC()
    {
        return this.numberoflocationsC;
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

    //--- DATABASE MAPPING : fax ( varchar ) 
    public void setFax( String fax )
    {
        this.fax = fax;
    }
    public String getFax()
    {
        return this.fax;
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

    //--- DATABASE MAPPING : billinggeocodeaccuracy ( varchar ) 
    public void setBillinggeocodeaccuracy( String billinggeocodeaccuracy )
    {
        this.billinggeocodeaccuracy = billinggeocodeaccuracy;
    }
    public String getBillinggeocodeaccuracy()
    {
        return this.billinggeocodeaccuracy;
    }

    //--- DATABASE MAPPING : naicsdesc ( varchar ) 
    public void setNaicsdesc( String naicsdesc )
    {
        this.naicsdesc = naicsdesc;
    }
    public String getNaicsdesc()
    {
        return this.naicsdesc;
    }

    //--- DATABASE MAPPING : photourl ( varchar ) 
    public void setPhotourl( String photourl )
    {
        this.photourl = photourl;
    }
    public String getPhotourl()
    {
        return this.photourl;
    }

    //--- DATABASE MAPPING : shippingstreet ( varchar ) 
    public void setShippingstreet( String shippingstreet )
    {
        this.shippingstreet = shippingstreet;
    }
    public String getShippingstreet()
    {
        return this.shippingstreet;
    }

    //--- DATABASE MAPPING : shippingcountry ( varchar ) 
    public void setShippingcountry( String shippingcountry )
    {
        this.shippingcountry = shippingcountry;
    }
    public String getShippingcountry()
    {
        return this.shippingcountry;
    }

    //--- DATABASE MAPPING : billingstreet ( varchar ) 
    public void setBillingstreet( String billingstreet )
    {
        this.billingstreet = billingstreet;
    }
    public String getBillingstreet()
    {
        return this.billingstreet;
    }

    //--- DATABASE MAPPING : dunsnumber ( varchar ) 
    public void setDunsnumber( String dunsnumber )
    {
        this.dunsnumber = dunsnumber;
    }
    public String getDunsnumber()
    {
        return this.dunsnumber;
    }

    //--- DATABASE MAPPING : yearstarted ( varchar ) 
    public void setYearstarted( String yearstarted )
    {
        this.yearstarted = yearstarted;
    }
    public String getYearstarted()
    {
        return this.yearstarted;
    }

    //--- DATABASE MAPPING : lastmodifiedbyid ( varchar ) 
    public void setLastmodifiedbyid( String lastmodifiedbyid )
    {
        this.lastmodifiedbyid = lastmodifiedbyid;
    }
    public String getLastmodifiedbyid()
    {
        return this.lastmodifiedbyid;
    }

    //--- DATABASE MAPPING : masterrecordid ( varchar ) 
    public void setMasterrecordid( String masterrecordid )
    {
        this.masterrecordid = masterrecordid;
    }
    public String getMasterrecordid()
    {
        return this.masterrecordid;
    }

    //--- DATABASE MAPPING : dandbcompanyid ( varchar ) 
    public void setDandbcompanyid( String dandbcompanyid )
    {
        this.dandbcompanyid = dandbcompanyid;
    }
    public String getDandbcompanyid()
    {
        return this.dandbcompanyid;
    }

    //--- DATABASE MAPPING : billingstate ( varchar ) 
    public void setBillingstate( String billingstate )
    {
        this.billingstate = billingstate;
    }
    public String getBillingstate()
    {
        return this.billingstate;
    }

    //--- DATABASE MAPPING : accountnumber ( varchar ) 
    public void setAccountnumber( String accountnumber )
    {
        this.accountnumber = accountnumber;
    }
    public String getAccountnumber()
    {
        return this.accountnumber;
    }

    //--- DATABASE MAPPING : annualrevenue ( float8 ) 
    public void setAnnualrevenue( Double annualrevenue )
    {
        this.annualrevenue = annualrevenue;
    }
    public Double getAnnualrevenue()
    {
        return this.annualrevenue;
    }

    //--- DATABASE MAPPING : billinglatitude ( float8 ) 
    public void setBillinglatitude( Double billinglatitude )
    {
        this.billinglatitude = billinglatitude;
    }
    public Double getBillinglatitude()
    {
        return this.billinglatitude;
    }

    //--- DATABASE MAPPING : website ( varchar ) 
    public void setWebsite( String website )
    {
        this.website = website;
    }
    public String getWebsite()
    {
        return this.website;
    }

    //--- DATABASE MAPPING : naicscode ( varchar ) 
    public void setNaicscode( String naicscode )
    {
        this.naicscode = naicscode;
    }
    public String getNaicscode()
    {
        return this.naicscode;
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
        sb.append(cleanstatus);
        sb.append("|");
        sb.append(type);
        sb.append("|");
        sb.append(shippinglatitude);
        sb.append("|");
        sb.append(description);
        sb.append("|");
        sb.append(numberofemployees);
        sb.append("|");
        sb.append(accountsource);
        sb.append("|");
        sb.append(shippingpostalcode);
        sb.append("|");
        sb.append(createdbyid);
        sb.append("|");
        sb.append(shippinggeocodeaccuracy);
        sb.append("|");
        sb.append(hcErr);
        sb.append("|");
        sb.append(shippingcity);
        sb.append("|");
        sb.append(sfid);
        sb.append("|");
        sb.append(lastreferenceddate);
        sb.append("|");
        sb.append(billinglongitude);
        sb.append("|");
        sb.append(phone);
        sb.append("|");
        sb.append(customerpriorityC);
        sb.append("|");
        sb.append(billingcity);
        sb.append("|");
        sb.append(shippingstate);
        sb.append("|");
        sb.append(shippinglongitude);
        sb.append("|");
        sb.append(lastactivitydate);
        sb.append("|");
        sb.append(billingpostalcode);
        sb.append("|");
        sb.append(lastmodifieddate);
        sb.append("|");
        sb.append(billingcountry);
        sb.append("|");
        sb.append(activeC);
        sb.append("|");
        sb.append(name);
        sb.append("|");
        sb.append(lastvieweddate);
        sb.append("|");
        sb.append(hcLastop);
        sb.append("|");
        sb.append(numberoflocationsC);
        sb.append("|");
        sb.append(isdeleted);
        sb.append("|");
        sb.append(fax);
        sb.append("|");
        sb.append(systemmodstamp);
        sb.append("|");
        sb.append(billinggeocodeaccuracy);
        sb.append("|");
        sb.append(naicsdesc);
        sb.append("|");
        sb.append(photourl);
        sb.append("|");
        sb.append(shippingstreet);
        sb.append("|");
        sb.append(shippingcountry);
        sb.append("|");
        sb.append(billingstreet);
        sb.append("|");
        sb.append(dunsnumber);
        sb.append("|");
        sb.append(yearstarted);
        sb.append("|");
        sb.append(lastmodifiedbyid);
        sb.append("|");
        sb.append(masterrecordid);
        sb.append("|");
        sb.append(dandbcompanyid);
        sb.append("|");
        sb.append(billingstate);
        sb.append("|");
        sb.append(accountnumber);
        sb.append("|");
        sb.append(annualrevenue);
        sb.append("|");
        sb.append(billinglatitude);
        sb.append("|");
        sb.append(website);
        sb.append("|");
        sb.append(naicscode);
        sb.append("|");
        sb.append(createddate);
        return sb.toString(); 
    } 

}
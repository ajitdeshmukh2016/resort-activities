package com.heroku.ra.dto;

import java.io.Serializable;

import com.heroku.ra.entities.PropertyC;

/**
 * @author rodrigo.torres
 *
 */
public class Property implements Serializable
{
    private static final long serialVersionUID = 1L;

    private Integer    id           ;
    private String     country      ;
    private String     city         ;
    private String     state        ;
    private String     address      ;
    private String     property_map ;
    private String     sfid         ;
    private String     name         ;

    public Property()
    {
		super();
    }

    public Property(PropertyC p){
    	this.id = p.getId();
    	this.country = p.getCountryC();
    	this.city = p.getCityC();
    	this.state = p.getStateC();
    	this.address = p.getAddressC();
    	this.property_map = p.getPopertyMapC();
    	this.sfid = p.getSfid();
    	this.name = p.getName();
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getProperty_map() {
		return property_map;
	}

	public void setProperty_map(String property_map) {
		this.property_map = property_map;
	}

	public String getSfid() {
		return sfid;
	}

	public void setSfid(String sfid) {
		this.sfid = sfid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
}
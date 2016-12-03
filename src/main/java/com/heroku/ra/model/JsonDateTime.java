package com.heroku.ra.model;

import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.heroku.ra.util.json.JsonOnlyAmPmSerializer;
import com.heroku.ra.util.json.JsonOnlyDateSerializer;
import com.heroku.ra.util.json.JsonOnlyFullDateSerializer;
import com.heroku.ra.util.json.JsonOnlyMonthMMMSerializer;
import com.heroku.ra.util.json.JsonOnlyMonthSerializer;
import com.heroku.ra.util.json.JsonOnlyTimeNoAmPmSerializer;
import com.heroku.ra.util.json.JsonOnlyTimeSerializer;

public class JsonDateTime {
/*
         "date": {
          "day": "30",
          "month": "11",
          "month_name": "NOV",
          "time": "1:00",
          "ampm": "pm",
          "full": "30/11 - 1:00 pm"
        }
        
        "date": {
        "fullTime": "08:00PM",
        "ampm": "PM",
        "date": "2016-12-08",
        "time": "08:00PM"
      }
*/
	Date d;
	public JsonDateTime (Date date){
		this.d = date;
	}
	
	@JsonSerialize(using = JsonOnlyMonthMMMSerializer.class)
    @Temporal(TemporalType.TIMESTAMP)
	public Date getMonth_name() {
		return d;
	}
	
	@JsonSerialize(using = JsonOnlyMonthSerializer.class)
    @Temporal(TemporalType.TIMESTAMP)
	public Date getMonth() {
		return d;
	}

	@JsonSerialize(using = JsonOnlyDateSerializer.class)
    @Temporal(TemporalType.TIMESTAMP)
	public Date getDate() {
		return d;
	}
	@JsonSerialize(using = JsonOnlyTimeSerializer.class)
    @Temporal(TemporalType.TIMESTAMP)
	public Date getFullTime() {
		return d;
	}

	@JsonSerialize(using = JsonOnlyAmPmSerializer.class)
    @Temporal(TemporalType.TIMESTAMP)
	public Date getAmpm() {
		return d;
	}
	
	@JsonSerialize(using = JsonOnlyTimeNoAmPmSerializer.class)
    @Temporal(TemporalType.TIMESTAMP)
	public Date getTime() {
		return d;
	}
	
	@JsonSerialize(using = JsonOnlyFullDateSerializer.class)
    @Temporal(TemporalType.TIMESTAMP)
	public Date getFull() {
		return d;
	}

}

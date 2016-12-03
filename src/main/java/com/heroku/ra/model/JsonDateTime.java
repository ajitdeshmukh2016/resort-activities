package com.heroku.ra.model;

import java.util.Date;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.heroku.ra.util.json.JsonOnlyAmPmSerializer;
import com.heroku.ra.util.json.JsonOnlyDateSerializer;
import com.heroku.ra.util.json.JsonOnlyTimeNoAmPmSerializer;
import com.heroku.ra.util.json.JsonOnlyTimeSerializer;

public class JsonDateTime {

	Date d;
	public JsonDateTime (Date date){
		this.d = date;
	}
	
	@JsonSerialize(using = JsonOnlyDateSerializer.class)
	public Date getDate() {
		return d;
	}
	@JsonSerialize(using = JsonOnlyTimeSerializer.class)
	public Date getFullTime() {
		return d;
	}

	@JsonSerialize(using = JsonOnlyAmPmSerializer.class)
	public Date getAmpm() {
		return d;
	}
	
	@JsonSerialize(using = JsonOnlyTimeNoAmPmSerializer.class)
	public Date getTime() {
		return d;
	}

}

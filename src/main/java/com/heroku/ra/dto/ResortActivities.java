package com.heroku.ra.dto;

import com.heroku.ra.entities.ResortActivityC;

public class ResortActivities {

	Iterable<ResortActivityC> today;
	Iterable<ResortActivityC> upcoming;
	
	public ResortActivities(){
		super();
	}
	
	public ResortActivities(Iterable<ResortActivityC> today, Iterable<ResortActivityC> upcoming){
		this.today = today;
		this.upcoming = upcoming;
	}
	
	public Iterable<ResortActivityC> getToday() {
		return today;
	}
	public void setToday(Iterable<ResortActivityC> today) {
		this.today = today;
	}
	public Iterable<ResortActivityC> getUpcoming() {
		return upcoming;
	}
	public void setUpcoming(Iterable<ResortActivityC> upcoming) {
		this.upcoming = upcoming;
	}
	
}

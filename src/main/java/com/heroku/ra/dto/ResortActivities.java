package com.heroku.ra.dto;

public class ResortActivities {

	Iterable<ResortActivity> today;
	Iterable<ResortActivity> upcoming;
	private Iterable<ResortActivity> mine;
	
	public ResortActivities(){
		super();
	}
	
	public ResortActivities(Iterable<ResortActivity> mine, Iterable<ResortActivity> today, Iterable<ResortActivity> upcoming){
		this.today = today;
		this.upcoming = upcoming;
		this.setMine(mine);
	}
	
	public Iterable<ResortActivity> getToday() {
		return today;
	}
	public void setToday(Iterable<ResortActivity> today) {
		this.today = today;
	}
	public Iterable<ResortActivity> getUpcoming() {
		return upcoming;
	}
	public void setUpcoming(Iterable<ResortActivity> upcoming) {
		this.upcoming = upcoming;
	}

	public Iterable<ResortActivity> getMine() {
		return mine;
	}

	public void setMine(Iterable<ResortActivity> mine) {
		this.mine = mine;
	}
	
}

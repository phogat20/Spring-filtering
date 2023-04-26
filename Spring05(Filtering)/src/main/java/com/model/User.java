package com.model;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//@JsonIgnoreProperties({ "first" })

@JsonFilter("SomeFIlter") //Custom filter created
public class User {

	private String first;
//	@JsonIgnore
	private String second;
	private String thrid;

	public User(String first, String second, String thrid) {
		super();
		this.first = first;
		this.second = second;
		this.thrid = thrid;
	}

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getSecond() {
		return second;
	}

	public void setSecond(String second) {
		this.second = second;
	}

	public String getThrid() {
		return thrid;
	}

	public void setThrid(String thrid) {
		this.thrid = thrid;
	}

}

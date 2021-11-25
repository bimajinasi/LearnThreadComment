package com.bima.model;

import java.io.Serializable;

public class ThreadModel implements Serializable //converting object to bytestream
{
	private static final long serialVersionUID = 1L; //tagging stream
	
	private Integer id;
	private String name;
	private String time;
	private String postAmount;
	private String quote;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getPostAmount() {
		return postAmount;
	}
	public void setPostAmount(String postAmount) {
		this.postAmount = postAmount;
	}
	public String getQuote() {
		return quote;
	}
	public void setQuote(String quote) {
		this.quote = quote;
	}
	

}

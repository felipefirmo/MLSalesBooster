package com.mkyong.common.entity;

public class Notification {

	private String user_id;
	
	private String resource;
	
	private String topic;
	
	private String received;
	
	private String sent;

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id( String user_id ) {
		this.user_id = user_id;
	}

	public String getResource() {
		return resource;
	}

	public void setResource( String resource ) {
		this.resource = resource;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic( String topic ) {
		this.topic = topic;
	}

	public String getReceived() {
		return received;
	}

	public void setReceived( String received ) {
		this.received = received;
	}

	public String getSent() {
		return sent;
	}

	public void setSent( String sent ) {
		this.sent = sent;
	}
}

package com.mkyong.common.entity;

public class Resposta {

	private String text;
	
	private Long questionId;

	public String getText() {
		return text;
	}

	public void setText( String text ) {
		this.text = text;
	}

	public Long getQuestionId() {
		return questionId;
	}

	public void setQuestionId( Long questionId ) {
		this.questionId = questionId;
	}
}

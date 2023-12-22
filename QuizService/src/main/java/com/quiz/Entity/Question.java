package com.quiz.Entity;

public class Question {

	private Long id;
	private String question;
	private Long quizid;
	
	
	public Long getQuizid() {
		return quizid;
	}


	public void setQuizid(Long quizid) {
		this.quizid = quizid;
	}


	
	
	public Question() {
		System.out.println(this.getClass().getSimpleName());
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getQuestion() {
		return question;
	}


	public void setQuestion(String question) {
		this.question = question;
	}

	
}

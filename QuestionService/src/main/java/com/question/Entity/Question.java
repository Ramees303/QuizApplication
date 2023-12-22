package com.question.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="question")
public class Question {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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

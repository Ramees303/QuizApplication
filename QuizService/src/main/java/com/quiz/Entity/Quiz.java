package com.quiz.Entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Quiz implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String title;
	
	transient private List<Question> questions;
	
	
	public Quiz() {
		System.out.println(this.getClass().getSimpleName()+"created");
	}
	
	
	
	
	public List<Question> getQuestions() {
		return questions;
	}




	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}




	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}


	@Override
	public String toString() {
		return "Quiz [id=" + id + ", title=" + title + "]";
	}
	
	

}

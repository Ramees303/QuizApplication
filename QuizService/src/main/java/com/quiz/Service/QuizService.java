package com.quiz.Service;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.Entity.Quiz;
import com.quiz.QuestionClient.QuestionClient;
import com.quiz.Repository.QuizRepository;

@Service
public class QuizService {
	
	@Autowired
	private QuizRepository quizrepo;
	
	
	private QuestionClient questionclient;
	
	
	
	
	
	public QuizService(QuestionClient questionclient) {
		this.questionclient = questionclient;
	}

	public Quiz add(Quiz quiz) {
		return quizrepo.save(quiz);
		
	}
	
	public List<Quiz> get(){
		List<Quiz> quizz= quizrepo.findAll();
		Iterator<Quiz> it=quizz.iterator();
		while(it.hasNext()) {
			Quiz data=it.next();
			data.setQuestions(questionclient.getQuestionofQuiz(data.getId()));
		}
		return quizz;
	}

	
	public Quiz get(Long id) {
		Quiz quiz=quizrepo.findById(id).orElseThrow(()->new RuntimeException("quiz not found"));
		quiz.setQuestions(questionclient.getQuestionofQuiz(quiz.getId()));
		return quiz;
	}
	
}

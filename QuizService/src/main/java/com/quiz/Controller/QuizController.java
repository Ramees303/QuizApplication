package com.quiz.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.Entity.Quiz;
import com.quiz.Service.QuizService;

@RestController
@RequestMapping("/quiz")
public class QuizController {
	
	@Autowired
	private QuizService quizservice;
	
	
	@PostMapping
	public Quiz create(@RequestBody Quiz quiz) {
		return quizservice.add(quiz);
	}
	
	@GetMapping
	public List<Quiz> get(){
		return quizservice.get();
	}
	
	@GetMapping("/{id}")
	public Quiz getById(@PathVariable long id) {
		return quizservice.get(id);
	}

}

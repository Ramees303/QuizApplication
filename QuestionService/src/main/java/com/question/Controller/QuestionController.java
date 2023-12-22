package com.question.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.question.Entity.Question;
import com.question.Service.QuestionService;

@RestController
@RequestMapping("/question")
public class QuestionController {

	
	@Autowired
	private QuestionService questionservice;
	
	
	@PostMapping
	public Question createQuestion(@RequestBody Question question) {
		return questionservice.create(question);
	}
	
	@GetMapping
	public List<Question> get(){
		return questionservice.get();
	}
	
	@GetMapping("/{id}")
	public Question get(@PathVariable  Long id ) {
		return questionservice.get(id);
	}
	
	@GetMapping("/quiz/{quizid}")
	public List<Question> getQuestionByQuizId(@PathVariable Long quizid){
		return questionservice.getByQuizId(quizid);
	}
	
}

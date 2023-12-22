package com.question.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.question.Entity.Question;
import com.question.Repository.QuestionRepository;

@Service
public class QuestionService {
	
	@Autowired
	private QuestionRepository questionrepo;
	
	
	public Question create(Question question) {
		return questionrepo.save(question);
	}
	
	public List<Question> get(){
		return questionrepo.findAll();
	}
	
	public Question get(Long id) {
		return questionrepo.findById(id).orElseThrow(()->new RuntimeException("no question found"));
	}
	
	public List<Question> getByQuizId(Long id){
		return questionrepo.findByQuizid(id);
	}

}

package com.quiz.QuestionClient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.quiz.Entity.Question;

//@FeignClient(url="http://localhost:8083",value = "Question-client")
@FeignClient(name="QUESTION-SERVICE")
public interface QuestionClient {
	
	@GetMapping("/question/quiz/{quizid}")
	List<Question> getQuestionofQuiz(@PathVariable Long quizid);

}

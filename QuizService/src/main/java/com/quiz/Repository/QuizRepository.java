package com.quiz.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quiz.Entity.Quiz;

@Repository
public interface QuizRepository  extends JpaRepository<Quiz, Long>{

}

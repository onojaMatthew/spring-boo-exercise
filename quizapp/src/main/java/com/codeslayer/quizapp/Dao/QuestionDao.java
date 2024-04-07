package com.codeslayer.quizapp.Dao;

import com.codeslayer.quizapp.Model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionDao extends JpaRepository<Question, Integer> {
    // findByCategory is a custom function added to Dao to provide findByCategory function
    List<Question> findByCategory(String category);
}

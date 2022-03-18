package com.finalproject1.servicies;

import com.finalproject1.entities.Question;

import java.util.List;
import java.util.Optional;

public interface QuestionService {
    List<Question> findAllQuestion();

    Question saveQuestion(Question question);

    Optional<Question> findByIdQuestion(Long id);

    void deleteByIdQuestion(Long id);

}

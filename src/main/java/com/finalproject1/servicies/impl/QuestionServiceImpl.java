package com.finalproject1.servicies.impl;

import com.finalproject1.entities.Question;
import com.finalproject1.repositories.QuestionRepository;
import com.finalproject1.servicies.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class QuestionServiceImpl implements QuestionService {

    private final QuestionRepository questionRepository;

    @Override
    public List<Question> findAllQuestion() {
        return questionRepository.findAll();
    }

    @Override
    public Question saveQuestion(Question question) {
        return questionRepository.save(question);
    }

    @Override
    public Optional<Question> findByIdQuestion(Long id) {
        return questionRepository.findById(id);
    }

    @Override
    public void deleteByIdQuestion(Long id) {
        questionRepository.deleteById(id);
    }
}

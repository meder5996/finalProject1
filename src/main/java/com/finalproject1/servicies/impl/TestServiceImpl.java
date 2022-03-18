package com.finalproject1.servicies.impl;

import com.finalproject1.entities.Test;
import com.finalproject1.repositories.TestRepository;
import com.finalproject1.servicies.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class TestServiceImpl implements TestService {

    private final TestRepository testRepository;

    @Override
    public List<Test> findAllTest() {
        return testRepository.findAll();
    }

    @Override
    public Test saveTest(Test test) {
        return testRepository.save(test);
    }

    @Override
    public Optional<Test> findByIdTest(Long id) {
        return testRepository.findById(id);
    }

    @Override
    public void deleteByIdTest(Long id) {
        testRepository.deleteById(id);
    }
}

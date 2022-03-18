package com.finalproject1.servicies;

import com.finalproject1.entities.Question;
import com.finalproject1.entities.Test;

import java.util.List;
import java.util.Optional;

public interface TestService {
    List<Test> findAllTest();

    Test saveTest(Test test);

    Optional<Test> findByIdTest(Long id);

    void deleteByIdTest(Long id);
}

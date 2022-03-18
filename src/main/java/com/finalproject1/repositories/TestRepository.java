package com.finalproject1.repositories;

import com.finalproject1.entities.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TestRepository extends JpaRepository<Test, Long> {

    @Override
    List<Test> findAll();

    @Override
    <S extends Test> S save(S entity);

    @Override
    Optional<Test> findById(Long aLong);

    @Override
    void deleteById(Long aLong);
}

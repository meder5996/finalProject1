package com.finalproject1.servicies.impl;

import com.finalproject1.entities.Question;
import com.finalproject1.entities.User;
import com.finalproject1.repositories.UserRepository;
import com.finalproject1.servicies.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public List<User> findAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public Optional<User> findByIdUser(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public void deleteByIdUser(Long id) {
        userRepository.deleteById(id);
    }
}

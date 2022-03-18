package com.finalproject1.servicies;

import com.finalproject1.entities.Question;
import com.finalproject1.entities.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> findAllUser();

    User saveUser(User user);

    Optional<User> findByIdUser(Long id);

    void deleteByIdUser(Long id);
}

package com.j2ee.tdspring.services;

import com.j2ee.tdspring.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.j2ee.tdspring.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User createOrUpdate(User user) {
        return userRepository.save(user);
    }
    public User getUserById(String username) {
        return userRepository.findById(username).orElse(null);
    }

}
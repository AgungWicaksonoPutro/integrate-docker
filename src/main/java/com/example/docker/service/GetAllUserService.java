package com.example.docker.service;

import com.example.docker.model.entity.User;
import com.example.docker.model.response.GetAllUserResponse;
import com.example.docker.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetAllUserService {
    UserRepository userRepository;

    public GetAllUserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUser(){
        List<User> getAll = userRepository.findAll();
        return getAll;
    }
}

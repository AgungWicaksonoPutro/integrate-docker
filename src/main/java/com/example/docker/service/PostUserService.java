package com.example.docker.service;

import com.example.docker.model.entity.User;
import com.example.docker.model.request.UserRequest;
import com.example.docker.model.response.UserResponse;
import com.example.docker.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

@Service
public class PostUserService {

    UserRepository userRepository;

    public PostUserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserResponse execute(UserRequest input){
        Timestamp createTime = new Timestamp(System.currentTimeMillis());
        Timestamp updateTime = createTime;
        Boolean status = false;

        User user = User.builder()
                .name(input.getName())
                .birthDate(input.getBirthDate())
                .password(input.getPassword())
                .userName(input.getUserName())
                .phoneNumber(input.getPhoneNumber())
                .status(status)
                .createdAt(createTime)
                .updatedAt(updateTime)
                .build();

        User result = userRepository.save(user);

        UserResponse userResponse = UserResponse.builder()
                .userName(result.getUserName())
                .name(result.getName())
                .build();

        return userResponse;
    }
}

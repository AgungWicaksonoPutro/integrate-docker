package com.example.docker.controller;

import com.example.docker.model.request.UserRequest;
import com.example.docker.model.response.UserResponse;
import com.example.docker.service.PostUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/docker-test")
public class PostUserController {

    PostUserService postUserService;

    public PostUserController(PostUserService postUserService) {
        this.postUserService = postUserService;
    }

    @PostMapping("/user")
    public UserResponse postUser(@RequestBody UserRequest input){
        return postUserService.execute(input);
    }
}

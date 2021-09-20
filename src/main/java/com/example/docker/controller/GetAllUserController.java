package com.example.docker.controller;

import com.example.docker.model.entity.User;
import com.example.docker.model.response.GetAllUserResponse;
import com.example.docker.service.GetAllUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/docker-test")
public class GetAllUserController {

    GetAllUserService getAllUserService;

    public GetAllUserController(GetAllUserService getAllUserService) {
        this.getAllUserService = getAllUserService;
    }

    @GetMapping("/user")
    public List<User> getAllUser(){
        return getAllUserService.getAllUser();
    }
}

package com.example.demo.application;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.api.UserResource;

@Service
public interface UserQueryService {

	Optional<UserResource> getUser(String userId);

}

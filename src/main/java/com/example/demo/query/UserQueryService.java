package com.example.demo.query;

import java.util.Optional;

import com.example.demo.api.UserResource;

public interface UserQueryService {

	Optional<UserResource> getUser(String userId);

}

package com.example.demo.infrastructure;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.example.demo.api.UserResource;
import com.example.demo.query.UserQueryService;

@Repository("userQueryServiceImpl")
public class UserQueryServiceImpl implements UserQueryService {

	@Override
	public Optional<UserResource> getUser(String userId) {
		return Optional.of(new UserResource(userId, "Full Name", "20001010"));
	}

}

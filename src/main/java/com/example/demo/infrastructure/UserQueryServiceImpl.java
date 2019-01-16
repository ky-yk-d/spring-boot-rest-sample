package com.example.demo.infrastructure;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.api.UserResource;
import com.example.demo.application.UserQueryService;

@Service
public class UserQueryServiceImpl implements UserQueryService {

	public Optional<UserResource> getUser(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

}

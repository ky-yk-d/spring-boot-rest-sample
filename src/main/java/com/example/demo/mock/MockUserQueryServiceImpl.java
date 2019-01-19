package com.example.demo.mock;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.example.demo.api.UserResource;
import com.example.demo.query.UserQueryService;

@Repository("mockUserQueryServiceImpl")
public class MockUserQueryServiceImpl implements UserQueryService {
	
	private List<UserResource> users;
	

	public MockUserQueryServiceImpl() {
		this.users = new ArrayList<>();
		this.users.add(UserResource.create("1","Kent Beck", "19610331"));
		this.users.add(UserResource.create("2","Erich Gamma ", "19610313"));
		this.users.add(UserResource.create("3","Alistair Cockburn", "195311119"));
	}



	@Override
	public Optional<UserResource> getUser(String userId) {
		return Optional.ofNullable(users.stream()
				.filter(user -> user.user_id().equals(userId))
				.findFirst()
				.orElse(null));
	}

}

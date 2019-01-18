package com.example.demo.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.application.SampleApplicationService;
import com.example.demo.query.UserQueryService;

@RestController
@RequestMapping("api/v1")
public class SampleRestApiController {
	
	@Autowired
	private SampleApplicationService sampleApplicationService;

	@Autowired
	@Qualifier("mockUserQueryServiceImpl")
	private UserQueryService userQueryService;
	
	@RequestMapping(path = "sample", method = RequestMethod.GET)
	public ResponseEntity<String> sample(
			@RequestParam Optional<List<String>> ym
			){
		
		HttpStatus httpStatus = HttpStatus.OK;
		String str = this.sampleApplicationService.sample();
		return new ResponseEntity<String>(str, httpStatus);
	}
	
	@RequestMapping(path = "users/{userId}", method = RequestMethod.GET)
	public ResponseEntity<UserResource> getUser(
			@PathVariable String userId
			){
		Optional<UserResource> user = this.userQueryService.getUser(userId);
		
		HttpStatus httpStatus;
		httpStatus = user.isPresent() ? HttpStatus.OK : HttpStatus.NOT_FOUND;
		return new ResponseEntity<UserResource>(user.get(), httpStatus);
		
	}
}

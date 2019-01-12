package com.example.demo.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.application.SampleApplicationService;

@RestController
@RequestMapping("api/v1")
public class SampleRestApiController {
	
	@Autowired
	private SampleApplicationService sampleApplicationService;
	
	@RequestMapping(path = "{hogeId}/sample", method = RequestMethod.GET)
	public ResponseEntity<String> sample(
			@PathVariable String hogeId,
			@RequestParam Optional<List<String>> ym
			){
		
		HttpStatus httpStatus = HttpStatus.OK;
		String str = this.sampleApplicationService.sample();
		return new ResponseEntity<String>(str, httpStatus);
	}
}

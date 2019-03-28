package com.example.demo.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class SampleApplicationService {
	public String sample() {
		Logger logger = LoggerFactory.getLogger(SampleApplicationService.class);
		logger.debug("ロギングのテスト");
		
		return "SampleApplicationServiceクラス";
	}
}

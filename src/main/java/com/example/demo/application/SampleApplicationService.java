package com.example.demo.application;

import org.springframework.stereotype.Service;

import com.example.demo.framework.logging.LoggerWrapper;

@Service
public class SampleApplicationService {
	public String sample() {
		LoggerWrapper logger = LoggerWrapper.getLogger(SampleApplicationService.class);
		logger.debug("ロギングのテスト");
		
		return "SampleApplicationServiceクラス";
	}
}

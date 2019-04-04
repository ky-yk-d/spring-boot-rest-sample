package com.example.demo.framework.logging;

import org.junit.jupiter.api.Test;

/**
 * @author ky_yk_d
 *
 */
class LoggerWrapperTest {

	@Test
	void testGetLogger() {
		LoggerWrapper logger = LoggerWrapper.getLogger(LoggerWrapperTest.class);
		logger.debug("debug:{}", 111);
		logger.info("info:{}", "test");
		logger.warn("warn:{}, {}", "arg1", "arg2");
		logger.error("error:", new RuntimeException("error message"));
	}

}

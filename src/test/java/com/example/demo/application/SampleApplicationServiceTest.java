package com.example.demo.application;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SampleApplicationServiceTest {

	@Test
	void sampleのテスト() {
		SampleApplicationService service = new SampleApplicationService();
		assertEquals("SampleApplicationServiceクラス", service.sample());
	}

}

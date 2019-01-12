package com.example.demo.api;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.not;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import com.example.demo.domain.application.SampleApplicationService;

@ExtendWith(SpringExtension.class)
@WebMvcTest(SampleRestApiController.class)
public class SampleRestApiControllerTest {
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private SampleApplicationService sampleApplicationService;
	
	@Test
	public void モックが正常に利用できる() throws Exception {
		when(sampleApplicationService.sample()).thenReturn("SampleApplicationService");
		mockMvc.perform(get("/api/v1/123/sample?ym=201901,201902"))
			.andExpect(status().isOk())
			.andExpect(content().string(containsString("SampleApplicationService")));
	}
	
	@Test
	public void モックの返却した値が不正な場合() throws Exception {
		when(sampleApplicationService.sample()).thenReturn("Wrong String");
		mockMvc.perform(get("/api/v1/123/sample?ym=201901,201902"))
			.andExpect(status().isOk())
			.andExpect(content().string(not(containsString("SampleApplicationService"))));
	}
}

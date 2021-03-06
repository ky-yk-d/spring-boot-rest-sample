package com.example.demo.api;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import com.example.demo.application.SampleApplicationService;
import com.example.demo.query.UserQueryService;

@ExtendWith(SpringExtension.class)
@WebMvcTest(SampleRestApiController.class)
public class SampleRestApiControllerTest {
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private SampleApplicationService sampleApplicationService;
	
	@InjectMocks
	private SampleRestApiController controller;
	@MockBean
	@Qualifier("mockUserQueryServiceImpl")
	private UserQueryService queryService;
	
	@BeforeEach
	void setUp() throws Exception{
		System.out.println("テスト開始");
		UserResource kent = UserResource.create("1","Kent Beck", "19610331");
		UserResource erich = UserResource.create("2","Erich Gamma ", "19610313");
		UserResource alistair = UserResource.create("3","Alistair Cockburn", "195311119");
		doReturn(Optional.of(kent)).when(queryService).getUser("1");
		doReturn(Optional.of(erich)).when(queryService).getUser("2");
		doReturn(Optional.of(alistair)).when(queryService).getUser("3");
	}
	
	@Test
	public void 通るはずのテスト() throws Exception {
		assertTrue(true);
	}
	
	@Test
	public void モックが正常に利用できる() throws Exception {
		when(sampleApplicationService.sample()).thenReturn("SampleApplicationService");
		mockMvc.perform(get("/api/v1/sample?ym=201901,201902"))
			.andExpect(status().isOk())
			.andExpect(content().string(containsString("SampleApplicationService")));
	}
	
	@Test
	public void モックの返却した値が不正な場合() throws Exception {
		when(sampleApplicationService.sample()).thenReturn("Wrong String");
		mockMvc.perform(get("/api/v1/sample?ym=201901,201902"))
			.andExpect(status().isOk())
			.andExpect(content().string(not(containsString("SampleApplicationService"))));
	}
	@Test
	public void クエリに1を投げるとKentが返ってくる() throws Exception {
		mockMvc.perform(get("/api/v1/users/1"))
			.andExpect(content().string(containsString("Kent Beck")))
			.andExpect(content().string(containsString("user_id")))
			.andExpect(content().string(containsString("full_name")))
			.andExpect(content().string(containsString("birth_date")))
			.andExpect(content().string(not(containsString("get"))));
	}
	
}

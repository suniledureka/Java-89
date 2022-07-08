package com.posidex.rest.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.posidex.rest.services.WelcomeService;

@WebMvcTest(value = WelcomeRestController.class)
class WelcomeRestControllerTest {
	@MockBean
	private WelcomeService welcomeService; //creating a mock object / substitute object
	
	@Autowired
	private MockMvc mockMvc; //to send a request to REST API
	
	@Test
	void testSendWelcomeMessage() throws Exception {
		Mockito.when(welcomeService.getWelcomeMessage()).thenReturn("this is a mock message");
		
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/welcome"); //to prepare an HTTP Request
		
		ResultActions perform = mockMvc.perform(requestBuilder);// sending a request
		
		MvcResult result = perform.andReturn();
		
		MockHttpServletResponse response = result.getResponse();
		
		int status = response.getStatus();
		/*
		String data = response.getContentAsString();
		System.out.println(data);
		*/
		assertEquals(200, status);
	}

}

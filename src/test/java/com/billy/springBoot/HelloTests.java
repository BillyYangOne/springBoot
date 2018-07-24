package com.billy.springBoot;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import static org.hamcrest.Matchers.equalTo;    
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;    
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;  

import com.billy.springBoot.controller.HelloworldController;

/**
 * 单元测试
 * @author BillyYang
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloTests {

	private MockMvc mvc;
	
	@Before
	public void setUp() throws Exception {
		mvc = MockMvcBuilders.standaloneSetup(new HelloworldController()).build();
	}
	
	@Test
	public void getHello() throws Exception {
		
		mvc.perform(MockMvcRequestBuilders.get("/hello").accept( MediaType.APPLICATION_JSON))
		.andExpect(status().isOk())
		.andExpect(content().string(equalTo("hello world!" )));
		System.out.println("测试成功！");
	}
	
}

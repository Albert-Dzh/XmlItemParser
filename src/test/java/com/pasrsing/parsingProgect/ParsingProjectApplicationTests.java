package com.pasrsing.parsingProgect;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;


@SpringBootTest
@AutoConfigureMockMvc
class ParsingProjectApplicationTests {

	@Autowired
	MockMvc mockMvc;

	@Test
	void contextLoads() {
	}

	@Test
	void checkItems() throws Exception {
		mockMvc.perform(get("/getItems"))
				.andDo(print())
				.andExpect(status().isOk())
				.andExpect(content().string(containsString("TOTAL ITEMS")));
	}

	@Test
	void checkPerks() throws Exception {
		mockMvc.perform(get("/getPerks"))
				.andDo(print())
				.andExpect(status().isOk())
				.andExpect(content().string(containsString("TOTAL PERKS")));
	}
}

package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class DemoApplicationTests {
	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	void handlerInterceptorTest() {
		// given
		String name = "Joonho";
		String url = "http://localhost:8080/hello/" + name;

		// when
		ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);

		// then
		Assertions.assertEquals(response.getStatusCode(), HttpStatus.OK);
	}
}

package com.tdevs.d10cw1d4;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class D10cW1d4ApplicationTests {

	@Value("${runtest}")
	boolean testResult;

	@Test
	void contextLoads() {
	}

	@Test
	void runEnvTest() {
		if(!testResult) {
			throw new RuntimeException("Failed test for simulation");
		}
	}
}

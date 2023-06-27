package com.magcdev.employeemanager;

import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeemanagerApplicationTests {

	@Test
	void contextLoads() {
		assertAll(() -> {
			System.out.println("Application is running");
		});
	}
}
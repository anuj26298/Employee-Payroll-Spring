package com.example.employeepayroll;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@Slf4j
public class EmployeePayrollSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeePayrollSpringApplication.class, args);
		ConfigurableApplicationContext configurableApplicationContext = SpringApplication
				.run(EmployeePayrollSpringApplication.class,args);
		log.info("Employee Payroll Spring Started in {} Environment", configurableApplicationContext
				.getEnvironment().getProperty("environment"));
		log.info("Employee Payroll DB user is {} ", configurableApplicationContext
				.getEnvironment().getProperty("spring.datasource.username"));
	}

}

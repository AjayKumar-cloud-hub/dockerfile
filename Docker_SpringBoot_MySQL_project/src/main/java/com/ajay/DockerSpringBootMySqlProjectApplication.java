package com.ajay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ajay.runner.TestRunner;

@SpringBootApplication
public class DockerSpringBootMySqlProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DockerSpringBootMySqlProjectApplication.class, args);
		String[] beanDefinitionNames = context.getBeanDefinitionNames();
		for(String beans : beanDefinitionNames) {
			System.out.println(beans.toString());
		}
		TestRunner runner = context.getBean(TestRunner.class,"testRunner");
		System.out.println(runner);
	}

}

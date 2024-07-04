package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoJenkinsB224Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoJenkinsB224Application.class, args);
	}
	@GetMapping("/msg")
	public String show() {
		return "welcome to jenkin session";
	}
	@GetMapping("/abc")
	public String show1() {
		return "bye to jenkin session";
	}

}

package com.example.hero;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class HeroApplication {

	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "Hello World from String Boot on Heroku Ugrade to SDK 11. Deployed from Github";
	}

	public static void main(String[] args) {
		SpringApplication.run(HeroApplication.class, args);
	}

}

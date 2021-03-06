package com.example.KeywordService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
@EnableEurekaClient
public class Application {
	@RequestMapping("/home")
    @ResponseBody
    String home() {
      return "Hello World!";
    }

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}

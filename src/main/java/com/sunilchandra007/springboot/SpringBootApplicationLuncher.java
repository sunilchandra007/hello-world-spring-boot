package com.sunilchandra007.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringBootApplicationLuncher {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootApplicationLuncher.class, args);
	}
}

@RestController
@RequestMapping("/HelloWorld")
class SpringBootController {

	@RequestMapping("/welcome")
	public String sayHello() {
		return "Hello Spring boot!!!";
	}

	@RequestMapping(
			value = "/{name}"
			,method = RequestMethod.GET
			//,headers= "Accept=application/text"
	)
	public String hello(@PathVariable String name) {
		String result = "Hello " + name;
		return result;
	}

}

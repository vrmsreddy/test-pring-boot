package org.pasut.test.spring.boot.properties.yaml;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration //como agregue la dependencia web (tomcat + spring MVC), asume que estoy creando una aplicacion web 
public class Main {
	
	@RequestMapping("/")
	String hello(@Value("${property}") String hello) {
		return hello;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

}

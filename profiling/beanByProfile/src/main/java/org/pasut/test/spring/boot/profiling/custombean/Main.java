package org.pasut.test.spring.boot.profiling.custombean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ComponentScan
@EnableAutoConfiguration //como agregue la dependencia web (tomcat + spring MVC), asume que estoy creando una aplicacion web 
public class Main {
	private final CustomBean bean;
	
	@Autowired
	public Main(CustomBean bean) {
		this.bean = bean;
	}
	
	
	@RequestMapping("/")
	String hello() {
		return bean.getText();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

}

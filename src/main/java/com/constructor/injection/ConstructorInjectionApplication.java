package com.constructor.injection;

import com.constructor.injection.service.Human;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ConstructorInjectionApplication {

	public static void main(String[] args) {

		SpringApplication.run(ConstructorInjectionApplication.class, args);
//		ConfigurableApplicationContext run = SpringApplication.run(ConstructorInjectionApplication.class, args);
//		Human human = run.getBean(Human.class);
//		human.live();

	}
}

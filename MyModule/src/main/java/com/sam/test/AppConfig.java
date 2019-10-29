package com.sam.test;

import com.sam.test.mybeans.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.sam.test")
public class AppConfig {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

		User user = ac.getBean(User.class);
		System.out.println(user.getName());
	}
}

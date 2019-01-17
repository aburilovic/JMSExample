package com.aburilovic.springjmsexample;

import com.aburilovic.springjmsexample.jms.Receiver;
import com.aburilovic.springjmsexample.jms.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringJmsExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJmsExampleApplication.class, args);
	}
}


package com.delhivery.camelpractice;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.jms.ConnectionFactory;

@SpringBootApplication
public class CamelPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(CamelPracticeApplication.class, args);
	}

	CamelContext context = new DefaultCamelContext();
	ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("vm://localhost?broker.persistent=false");
	context.addComponent("test-jms", JmsComponent.jmsComponentAutoAcknowledge(connectionFactory));


}


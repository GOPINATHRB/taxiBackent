package com.senderThread.sender;

import org.springframework.boot.SpringApplication;/*
import com.senderThread.sender.senderThread.*;*/
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		//MessageSenderThread messageSenderThread = new MessageSenderThread();
		
	//	messageSenderThread.sendMessage("Hello".getBytes());
	}

/*@Bean
	public WebServerFactoryCustomizer<TomcatServletWebServerFactory> containerCustomizer() {
		return container -> {
			String port = System.getenv("X_ZOHO_CATALYST_LISTEN_PORT");
			if (port != null && !port.isEmpty()) {
				container.setPort(Integer.parseInt(port));
			} else {
				container.setPort(9000);
			}
		};*/
	//}
}

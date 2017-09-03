package net.gmsworld.server.camel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
 
@SpringBootApplication
@ImportResource("classpath:spring/camel-context.xml")
public class CamelApplication {
 
	public static void main(String[] args) {
		SpringApplication.run(CamelApplication.class, args);
	}
}

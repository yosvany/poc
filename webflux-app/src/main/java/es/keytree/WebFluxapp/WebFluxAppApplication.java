package es.keytree.WebFluxapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.config.EnableWebFlux;

@SpringBootApplication
@EnableWebFlux
public class WebFluxAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebFluxAppApplication.class, args);
	}

}

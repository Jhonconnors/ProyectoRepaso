package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ProyectoRepasoApplication {
	
	@GetMapping("/v1")
	public String saludar() {
		return "Test de conexion Azure";
	}

	public static void main(String[] args) {
		SpringApplication.run(ProyectoRepasoApplication.class, args);
	}

}

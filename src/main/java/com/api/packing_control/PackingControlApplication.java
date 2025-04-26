package com.api.packing_control;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
public class PackingControlApplication {

	public static void main(String[] args) {
		SpringApplication.run(PackingControlApplication.class, args);
	}


}

package com.api.parkingcontrol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.parkingcontrol.models.ParkingSpotModel;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@RestController
public class ParkingControlApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParkingControlApplication.class, args);
	}
	@GetMapping("/")
	public String index() {
		return "Olá Mundo";
	}
	
}

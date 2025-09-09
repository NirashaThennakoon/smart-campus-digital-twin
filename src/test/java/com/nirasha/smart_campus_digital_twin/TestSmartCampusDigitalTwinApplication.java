package com.nirasha.smart_campus_digital_twin;

import org.springframework.boot.SpringApplication;

public class TestSmartCampusDigitalTwinApplication {

	public static void main(String[] args) {
		SpringApplication.from(SmartCampusDigitalTwinApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}

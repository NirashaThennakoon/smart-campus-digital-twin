package com.nirasha.smart_campus_digital_twin;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class SmartCampusDigitalTwinApplicationTests {

  @Test
  void contextLoads() {}
}

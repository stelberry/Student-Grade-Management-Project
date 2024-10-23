package uk.ac.rhul.cs2800.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RegistrationTest {

  @Test
  void registrationTest() {
    // Test9
    // Test: Ensure module is properly set during registration
    Module module = new Module(101, "Software Engineering", true);
    Registration registration = new Registration(module);

    assertEquals(module, registration.getModule());
  }

}

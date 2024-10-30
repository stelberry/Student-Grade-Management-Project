package uk.ac.rhul.cs2800.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RegistrationTest {

  @Test
  void registrationTest() {
    // Test9
    Module module = new Module("101", "Software Engineering", true);
    Student student = new Student(101064264L, "Yoon", "Ei", "yoonei", "yoonei@gmail.com");
    Registration registration = new Registration(module, student);

    assertEquals(module, registration.getModule());
    assertEquals(student, registration.getStudent());
  }

}

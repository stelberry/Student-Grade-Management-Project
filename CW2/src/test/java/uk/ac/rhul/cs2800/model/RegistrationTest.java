package uk.ac.rhul.cs2800.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import uk.ac.rhul.cs2800.model.Module;
import uk.ac.rhul.cs2800.model.Registration;
import uk.ac.rhul.cs2800.model.Student;

public class RegistrationTest {

  @Test
  void registrationTest() {
    // Test9
    Module module = new Module("101", "Software Engineering", true);
    Student student = new Student(101064264L, "Yoon", "Ei", "yoonei", "yoonei@gmail.com");
    Registration registration = new Registration(module);
    registration.setModule(module);
    assertEquals(module, registration.getModule());
  }

}

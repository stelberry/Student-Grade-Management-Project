package uk.ac.rhul.cs2800.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import uk.ac.rhul.cs2800.exception.NoGradeAvailableException;
import uk.ac.rhul.cs2800.exception.NoRegistrationException;

public class StudentTest {

  @Test
  void computeAverageTest() throws NoGradeAvailableException, NoRegistrationException {
    // Test 1
    Student student = new Student(101064264L, "Yoon", "Ei", "yoonei", "yoonei@gmail.com");
    Grade grade1 = new Grade(80);
    Grade grade2 = new Grade(80);
    Module module1 = new Module(101, "Software Engineering", true);
    Module module2 = new Module(102, "Databases", false);
    
    student.registerModule(module1);
    student.registerModule(module2);

    student.addGrade(grade1, module1);
    student.addGrade(grade2, module2);
    assertEquals(80.0f, student.computeAverage());

  }

  @Test
  void computeAveragewithEmptyGradesTest() {
    // Test 2
    assertThrows(NoGradeAvailableException.class, () -> {
      Student student = new Student(101064264L, "Yoon", "Ei", "yoonei", "yoonei@gmail.com");
      student.computeAverage();
    });
  }
  
  @Test
  void addGradeTest() throws NoGradeAvailableException, NoRegistrationException {
    // Test 5
    Student student = new Student(101064264L, "Yoon", "Ei", "yoonei", "yoonei@gmail.com");
    Module module = new Module(101, "Software Engineering", true);
    Grade grade = new Grade(80);

    student.registerModule(module);
    student.addGrade(grade, module);
    assertEquals(80, student.getGrade(module).getScore());

  }

  @Test
  void getGradeTest() throws NoGradeAvailableException, NoRegistrationException {
    // Test 6
    Student student = new Student(101064264L, "Yoon", "Ei", "yoonei", "yoonei@gmail.com");
    Module module = new Module(101, "Software Engineering", true);
    Grade grade = new Grade(80);

    student.registerModule(module);
    student.addGrade(grade, module);

    assertEquals(80, student.getGrade(module).getScore());
  }

@Test
void studentTest() {
  // Test 10
  Student student = new Student(101064264L, "Yoon", "Ei", "yoonei", "yoonei@gmail.com");
  assertEquals(101064264L, student.getId());
  assertEquals("Yoon", student.getFirstName());
  assertEquals("Ei", student.getLastName());
  assertEquals("yoonei", student.getUsername());
  assertEquals("yoonei@gmail.com", student.getEmail());
}

@Test
void addGradeToUnregisteredModuleTest() {
  // Test 11
  assertThrows(NoRegistrationException.class, () -> {
    Student student = new Student(101064264L, "Yoon", "Ei", "yoonei", "yoonei@gmail.com");
    Module module = new Module(101, "Software Engineering", true);
    Grade grade = new Grade(80);

    student.addGrade(grade, module);
  });
}

@Test
void getGradeWithEmptyGradeTest() {
  // Test 12
  Student student = new Student(101064264L, "Yoon", "Ei", "yoonei", "yoonei@gmail.com");
  Module module = new Module(101, "Software Engineering", true);
  student.registerModule(module);

  assertThrows(NoGradeAvailableException.class, () -> {
    student.getGrade(module);
  });
}

@Test
void computeAverageWithOneGradeTest() throws NoGradeAvailableException, NoRegistrationException {
  // Test 13
  Student student = new Student(101064264L, "Yoon", "Ei", "yoonei", "yoonei@gmail.com");
  Module module = new Module(101, "Software Engineering", true);
  Grade grade = new Grade(75);

  student.registerModule(module);
  student.addGrade(grade, module);

  assertEquals(75.0f, student.computeAverage());
}


}

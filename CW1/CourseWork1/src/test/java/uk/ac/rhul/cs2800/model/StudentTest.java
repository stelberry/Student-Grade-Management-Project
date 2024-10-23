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
    Student student = new Student();
    Grade grade1 = new Grade(80);
    Grade grade2 = new Grade(90);
    Module module1 = new Module(101, "Software Engineering", true);
    Module module2 = new Module(102, "Databases", false);
    
    student.registerModule(module1);
    student.registerModule(module2);

    student.addGrade(grade1, module1);
    student.addGrade(grade2, module2);
    assertEquals(5.0f, student.computeAverage());

  }

  @Test
  void computeAverageTestwithEmptyGradesTest() {
    // Test 2
    assertThrows(NoGradeAvailableException.class, () -> {
      Student student = new Student();
      student.computeAverage();
    });
  }
  
  @Test
  void addGradeTest() throws NoGradeAvailableException, NoRegistrationException {
    // Test 5: Ensure grades can be added and retrieved properly.
    Student student = new Student();
    Module module = new Module(101, "Software Engineering", true);
    Grade grade = new Grade(80);
    student.addGrade(grade, module);
    assertEquals(8, student.getGrade(module).getScore());

  }

  @Test
  void getGradeTest() throws NoGradeAvailableException, NoRegistrationException {
    // Test 6
    Student student = new Student();
    Module module = new Module(101, "Software Engineering", true);
    Grade grade = new Grade(80);
    student.addGrade(grade);

    student.registerModule(module);

    assertEquals(80, student.getGrade(module).getScore());
  }


}

package uk.ac.rhul.cs2800.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import uk.ac.rhul.cs2800.exception.NoGradeAvailableException;

public class StudentTest {

  @Test
  void computeAverageTest() throws NoGradeAvailableException {
    // Test 1
    Student student = new Student();
    student.addGrade(new Grade(5));
    student.addGrade(new Grade(5));
    student.addGrade(new Grade(5));

    assertEquals(5.0f, student.computeAverage());

  }

  @Test
  void computeAverageTestwithEmptyGrades() {
    // Test 2
    assertThrows(NoGradeAvailableException.class, () -> {
      Student student = new Student();
      student.computeAverage();
    });
  }
  
}

  void addGradeTest() throws NoGradeAvailableException {
    // Test 5: Ensure grades can be added and retrieved properly.
    Student student = new Student();
    Grade grade = new Grade(7);
    student.addGrade(grade);

    assertEquals(7, grade);
  }

  @Test
  void getGradeTest() throws NoGradeAvailableException {
    // Test 6
    Student student = new Student();
    Module module = new Module(101, "Software Engineering", true);
    Grade grade = new Grade(80);
    student.addGrade(grade);

    student.registeraterModule(module);

    assertEquals(80, student.getGrade(module).getScore());
  }


}

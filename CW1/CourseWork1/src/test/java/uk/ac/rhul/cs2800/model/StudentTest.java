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
  void computAverageTestwithEmptyGrades() {
    // Test 2
    assertThrows(NoGradeAvailableException.class, () -> {
      Student student = new Student();
      student.computeAverage();
    });
  }
  
  @Test
  void getGradeTest() throws NoGradeAvailableException {
    // Test5
    Student student = new Student();
    Module module = new Module();
    Grade grade = new Grade(80);
    assertEquals(80, student.getGrade(module).getScore());
  }


}

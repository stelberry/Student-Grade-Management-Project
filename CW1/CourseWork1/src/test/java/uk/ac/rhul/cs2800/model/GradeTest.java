package uk.ac.rhul.cs2800.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class GradeTest {
  @Test
  void GradeTest() {
    // Test3
    Grade grade = new Grade();
    grade.setScore(3);
    assertEquals(3, grade.getScore());
  }

  @Test
  void GradeTestwithNewConstructor() {
    // Test4
    Grade grade = new Grade(4);
    assertEquals(4, grade.getScore());
  }

}


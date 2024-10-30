package uk.ac.rhul.cs2800.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class GradeTest {
  @Test
  void gradeTest() {
    // Test3
    Grade grade = new Grade();
    Module module = new Module("101", "Software Engineering", true);
    grade.setScore(60);
    grade.setModule(module);
    assertEquals(60, grade.getScore());
    assertEquals(module, grade.getModule());
  }

  @Test
  void gradeTestwithNewConstructor() {
    // Test4
    Module module = new Module("101", "Software Engineering", true);
    Grade grade = new Grade(80, module);
    assertEquals(80, grade.getScore());
    assertEquals(module, grade.getModule());
  }

}



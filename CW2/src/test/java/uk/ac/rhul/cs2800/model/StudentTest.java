package uk.ac.rhul.cs2800.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uk.ac.rhul.cs2800.exception.NoGradeAvailableException;
import uk.ac.rhul.cs2800.exception.NoRegistrationException;
import uk.ac.rhul.cs2800.model.Grade;
import uk.ac.rhul.cs2800.model.Module;
import uk.ac.rhul.cs2800.model.Student;

public class StudentTest {

  private Student student;
  private Module module1;
  private Module module2;
  private Module module;

  @BeforeEach
  void setUp() {
    // initialize common objects before each test
    student = new Student(101064264L, "Yoon", "Ei", "yoonei", "yoonei@gmail.com");
    module = new Module("101", "Software Engineering", true);
    module1 = new Module("101", "Software Engineering", true);
    module2 = new Module("102", "Databases", false);
  }

  @Test
  void computeAverageTest() throws NoGradeAvailableException, NoRegistrationException {
    // Test 1
    // check that computeAverage method correctly calculates the average grade when grades are
    // availiable
    Grade grade1 = new Grade(80, module1);
    Grade grade2 = new Grade(80, module2);

    student.registerModule(module1);
    student.registerModule(module2);

    student.addGrade(grade1);
    student.addGrade(grade2);
    assertEquals(80.0f, student.computeAverage());

  }

  @Test
  void computeAveragewithEmptyGradesTest() {
    // Test 2
    // verify that computeAverage throws a NoGradeAvailableException when there are no grades
    assertThrows(NoGradeAvailableException.class, () -> {
      student.computeAverage();
    });
  }
  
  @Test
  void addGradeTest() throws NoGradeAvailableException, NoRegistrationException {
    // Test 5
    // verify that addGrade correctly add a grade for the registered module
    Grade grade = new Grade(80, module);

    student.registerModule(module);
    student.addGrade(grade);
    assertEquals(80, student.getGrade(module).getScore());

  }

  @Test
  void getGradeTest() throws NoGradeAvailableException, NoRegistrationException {
    // Test 6
    // check that getGrade correctly retrieves the grade for a specific module
    Grade grade = new Grade(80, module);

    student.registerModule(module);
    student.addGrade(grade);

    assertEquals(80, student.getGrade(module).getScore());
  }

  @Test
  void studentConstructorTest() {
    // Test 10
    // check that the Student object initializes with correct attributes
    student.setEmail("stella@gmail.com");
    student.setFirstName("Stella");
    student.setLastName("Ei");
    student.setId(1010L);
    student.setUsername("stella");
    assertEquals(1010L, student.getId());
    assertEquals("Stella", student.getFirstName());
    assertEquals("Ei", student.getLastName());
    assertEquals("stella", student.getUsername());
    assertEquals("stella@gmail.com", student.getEmail());
  }

  @Test
  void addGradeToUnregisteredModuleTest() {
    // Test 11
    // check that adding a grade to an unregistered module throws NoRegistrationException
    assertThrows(NoRegistrationException.class, () -> {
      Grade grade = new Grade(80, module);

      student.addGrade(grade);
    });
  }

  @Test
  void getGradeWithEmptyGradeTest() {
    // Test 12
    // verify that getGrade throws NoGradeAvailableException if no grade is available for the module
    assertThrows(NoGradeAvailableException.class, () -> {
      student.registerModule(module);

      student.getGrade(module);
    });
  }

  @Test
  void computeAverageWithOneGradeTest() throws NoGradeAvailableException, NoRegistrationException {
    // Test 13
    // check that computeAverage calculates the correct average when there is only one grade
    Grade grade = new Grade(75, module);

    student.registerModule(module);
    student.addGrade(grade);

    assertEquals(75.0f, student.computeAverage());
  }

  @Test
  void computeAverageWithMultipleRegistrationsButNoGradesTest() {
    // Test 14
    // check that computeAverage throws NoGradeAvailableException if no grade is available
    assertThrows(NoGradeAvailableException.class, () -> {
      student.registerModule(module1);
      student.registerModule(module2);

      student.computeAverage();
    });
  }

  @Test
  void getGradeWithMultipleRegistrationsTest()
      throws NoRegistrationException, NoGradeAvailableException {
    // Test 15
    // check that getGrade correctly retrieves the grades for a registered module and
    // throws NoGradeAvailableException for the module with no grade added.
    Grade grade = new Grade(85, module1);

    student.registerModule(module1);
    student.registerModule(module2);

    student.addGrade(grade);

    assertEquals(85, student.getGrade(module1).getScore());

    assertThrows(NoGradeAvailableException.class, () -> {
      student.getGrade(module2);
    });
  }

  @Test
  void getGradeWithNullModuleTest() {
    // Test 16
    // verify that getGrade throws NoGradeAvailableException when a null module is passed as the
    // parameter
    assertThrows(NoGradeAvailableException.class, () -> {
      student.getGrade(null);
    });
  }


}


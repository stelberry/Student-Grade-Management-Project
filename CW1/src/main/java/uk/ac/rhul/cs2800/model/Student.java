package uk.ac.rhul.cs2800.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import uk.ac.rhul.cs2800.exception.NoGradeAvailableException;
import uk.ac.rhul.cs2800.exception.NoRegistrationException;

/**
 * A class represents student.
 */
public class Student {

  public Long id;
  public String firstName;
  public String lastName;
  public String username;
  public String email;

  List<Registration> registrations = new ArrayList<>();
  Map<Module, Grade> gradeMap = new HashMap<>();

  /**
   * Constructs a new Student with details.
   *
   * @param id the ID of the student
   * @param firstName the first name of the student
   * @param lastName the last name of the student
   * @param username the username of the student
   * @param email the email of the student
   */
  public Student(Long id, String firstName, String lastName, String username, String email) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.username = username;
    this.email = email;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Long getId() {
    return id;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getUsername() {
    return username;
  }

  public String getEmail() {
    return email;
  }

  /**
   * It returns an average grade value.
   *
   * @return average grade in float
   * @throws NoGradeAvailableException if there is no grade available
   */
  public Float computeAverage() throws NoGradeAvailableException {
    float sum = 0;
    int count = 0;
    for (Grade grade : gradeMap.values()) {
      sum += grade.getScore();
      count++;
    }

    if (count == 0) {
      throw new NoGradeAvailableException();
    }
    return sum / count;
  }

  /**
   * Adds a grade to a specified module for the student.
   *
   * @param grade the grade to be added
   * @throws NoRegistrationException if the student is not registered in the specified module
   */
  public void addGrade(Grade grade) throws NoRegistrationException {
    Module module = grade.getModule();

    for (Registration registration : registrations) {

      if (registration.getModule().equals(module)) {
        gradeMap.put(module, grade);
        return;
      }
    }
    throw new NoRegistrationException();
  }

  /**
   * Gets the grade of the student for a specified module.
   *
   * @param module the module for which the grade is requested.
   * @return the grade for the specified module
   * @throws NoGradeAvailableException if there is no grade available
   */
  public Grade getGrade(Module module) throws NoGradeAvailableException {
    Grade grade = gradeMap.get(module);

    if (grade == null) {
      throw new NoGradeAvailableException();
    }
    return grade;
  }

  public void registerModule(Module module) {
    registrations.add(new Registration(module, this));

  }
}
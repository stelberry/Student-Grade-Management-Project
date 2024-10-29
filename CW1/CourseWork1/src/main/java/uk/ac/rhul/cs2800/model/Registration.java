package uk.ac.rhul.cs2800.model;

import uk.ac.rhul.cs2800.exception.NoGradeAvailableException;

/**
 * A class represents a student's registration in a specific module.
 */
public class Registration {

  private Module module;
  private Student student;

  public Registration(Module module, Student student) {
    this.module = module;
    this.student = student;
  }

  public Student getStudent() {
    return student;
  }

  public Module getModule() {
    return module;
  }

  public Grade getGrade() throws NoGradeAvailableException {
    return student.getGrade(module);
  }

  public void setGrade(Grade grade) {
    student.addGrade(grade);
  }

}


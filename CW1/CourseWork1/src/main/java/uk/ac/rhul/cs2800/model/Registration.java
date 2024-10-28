package uk.ac.rhul.cs2800.model;

/**
 * A class represents a student's registration in a specific module.
 */
public class Registration {

  private Module module;
  private Grade grade;

  public Registration(Module module) {
    this.module = module;
    this.grade = null;
  }

  public Module getModule() {
    return module;
  }

  public Grade getGrade() {
    return grade;
  }

  public void setGrade(Grade grade) {
    this.grade = grade;
  }

}

package uk.ac.rhul.cs2800.model;

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

  public void setModule(Module module) {
    this.module = module;
  }

}

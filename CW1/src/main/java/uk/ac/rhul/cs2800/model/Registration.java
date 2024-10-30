package uk.ac.rhul.cs2800.model;

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

  public void setStudent(Student student) {
    this.student = student;
  }

  public Student getStudent() {
    return student;
  }

  public void setModule(Module module) {
    this.module = module;
  }

  public Module getModule() {
    return module;
  }
}




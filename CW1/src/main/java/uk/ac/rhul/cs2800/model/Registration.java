package uk.ac.rhul.cs2800.model;

/**
 * A class represents a student's registration in a specific module.
 */
public class Registration {

  Module module;

  public Registration(Module module) {
    this.module = module;
  }

  public void setModule(Module module) {
    this.module = module;
  }

  public Module getModule() {
    return module;
  }
}




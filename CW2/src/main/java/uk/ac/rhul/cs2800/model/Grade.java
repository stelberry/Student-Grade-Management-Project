package uk.ac.rhul.cs2800.model;

/**
 * A class represents a student grade.
 */
public class Grade {

  private int score;
  Module module;

  public Grade() {

  }

  public Grade(int score, Module module) {
    this.score = score;
    this.module = module;
  }

  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }

  public void setModule(Module module) {
    this.module = module;
  }

  public Module getModule() {
    return module;
  }

}

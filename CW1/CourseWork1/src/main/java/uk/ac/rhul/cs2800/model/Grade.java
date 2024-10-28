package uk.ac.rhul.cs2800.model;

/**
 * A class represents a student grade.
 */
public class Grade {

  int score;

  public Grade() {

  }

  public Grade(int score) {
    this.score = score;
  }

  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }

}
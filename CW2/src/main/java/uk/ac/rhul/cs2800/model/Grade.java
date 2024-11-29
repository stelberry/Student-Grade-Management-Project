package uk.ac.rhul.cs2800.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

/**
 * A class represents a student grade.
 */
@Entity
public class Grade {
  @Id
  @GeneratedValue
  Long id;

  @ManyToOne
  @JoinColumn(name = "student_id")
  Student student;

  private int score;

  @OneToOne
  @JoinColumn(name = "module_code")
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

  public void setStudent(Student student) {
    this.student = student;
  }

  public Student getStudent() {
    return student;
  }

}
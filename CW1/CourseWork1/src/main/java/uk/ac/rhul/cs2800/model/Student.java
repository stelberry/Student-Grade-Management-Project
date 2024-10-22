package uk.ac.rhul.cs2800.model;

import java.util.ArrayList;
import java.util.List;
import uk.ac.rhul.cs2800.exception.NoGradeAvailableException;

/**
 * A class represents student.
 */
public class Student {

  List<Grade> grades;

  public Student() {
    this.grades = new ArrayList<Grade>();
  }

  /**
   * It returns an average grade value.
   *
   * @return average grade in float.
   * @throws NoGradeAvailableException if there is no grade available.
   */
  public Float computeAverage() throws NoGradeAvailableException {
    if (grades.size() < 1) {
      throw new NoGradeAvailableException();
    }
    Float sum = 0.0f;
    for (Grade grade : grades) {
      sum += grade.getScore();
    }
    return sum / this.grades.size();
  }

  public void addGrade(Grade grade) {
    this.grades.add(grade);
  }

}

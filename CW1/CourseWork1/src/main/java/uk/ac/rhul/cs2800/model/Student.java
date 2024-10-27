package uk.ac.rhul.cs2800.model;

import java.util.ArrayList;
import java.util.List;
import uk.ac.rhul.cs2800.exception.NoGradeAvailableException;
import uk.ac.rhul.cs2800.exception.NoRegistrationException;

/**
 * A class represents student.
 */
public class Student {
  List<Registration> registrations = new ArrayList<>();

  /**
   * It returns an average grade value.
   *
   * @return average grade in float.
   * @throws NoGradeAvailableException if there is no grade available.
   */
  public Float computeAverage() throws NoGradeAvailableException {

    if (grades.isEmpty()) {
      throw new NoGradeAvailableException();
    }
    Float sum = 0.0f;
    for (Grade grade : grades) {
      sum += grade.getScore();
    }
    return sum / this.grades.size();
  }

  public void addGrade(Grade grade, Module module) throws NoRegistrationException {
    Registration registration = null;
    for (Registration reg : registrations) {
      if (reg.getModule().equals(module)) {
        registration = reg;
        break;
      }
    }

    if (registration == null) {
      throw new NoRegistrationException();
    }

    registration.setGrade(grade);
  }

  public Grade getGrade(Module module) throws NoGradeAvailableException {
    for (Registration registration : registrations) {
      if (registration.getModule().equals(module)) {
        if (registration.getGrade() == null) {
          throw new NoGradeAvailableException();
        }
        return registration.getGrade();
      }
    }
    throw new NoGradeAvailableException();
  }

  public void registerModule(Module module) {
    registrations.add(new Registration(module));

  }
}




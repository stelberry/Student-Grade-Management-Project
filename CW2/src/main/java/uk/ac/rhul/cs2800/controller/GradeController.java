package uk.ac.rhul.cs2800.controller;

import java.util.Map;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import uk.ac.rhul.cs2800.model.Grade;
import uk.ac.rhul.cs2800.model.Module;
import uk.ac.rhul.cs2800.model.Student;
import uk.ac.rhul.cs2800.repository.GradeRepository;
import uk.ac.rhul.cs2800.repository.ModuleRepository;
import uk.ac.rhul.cs2800.repository.StudentRepository;

/**
 * A rest controller handles grade instances.
 */
@RestController
public class GradeController {
  private final GradeRepository gradeRepository;

  private final StudentRepository studentRepository;

  private final ModuleRepository moduleRepository;

  /**
   * GradeController with specified repositiories.
   *
   * @param gradeRepository the repository to handle grade entities
   * @param studentRepository the repository to handle student entitiies
   * @param moduleRepository the repository to handle module entities
   */
  public GradeController(GradeRepository gradeRepository, StudentRepository studentRepository,
      ModuleRepository moduleRepository) {
    this.gradeRepository = gradeRepository;
    this.studentRepository = studentRepository;
    this.moduleRepository = moduleRepository;
  }

  /**
   * addGrade POST handler.
   *
   * @param params It should contain "student_id", "score" and "module_code"
   * @return successfully saved grade object or exception
   */
  @PostMapping(value = "/grades/addGrade")
  public ResponseEntity<Grade> addGrade(@RequestBody Map<String, String> params) {

    Student student =
        studentRepository.findById(Long.valueOf(params.get("student_id"))).orElseThrow();

    Module module =
        moduleRepository.findById(String.valueOf(params.get("module_code"))).orElseThrow();

    Grade grade = new Grade();
    grade.setScore(Integer.valueOf(params.get("score")));
    grade.setModule(module);
    grade.setStudent(student);

    grade = gradeRepository.save(grade);

    return ResponseEntity.ok(grade);
  }
}
package uk.ac.rhul.cs2800.controller;

import java.util.Map;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import uk.ac.rhul.cs2800.model.Grade;
import uk.ac.rhul.cs2800.repository.GradeRepository;

@RestController
public class GradeController {
  private final GradeRepository gradeRepository;


  public GradeController(GradeRepository gradeRepository) {
    this.gradeRepository = gradeRepository;
  }

  @PostMapping(value = "/grades/addGrade")
  public ResponseEntity<Grade> addGrade(@RequestBody Map<String, String> params) {
    return null;

  }
}

package uk.ac.rhul.cs2800.controller;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import uk.ac.rhul.cs2800.model.Module;
import uk.ac.rhul.cs2800.model.Student;
import uk.ac.rhul.cs2800.repository.ModuleRepository;
import uk.ac.rhul.cs2800.repository.StudentRepository;
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
public class GradeControllerTest {
  @Autowired
  private MockMvc mockMvc;
  @Autowired
  private ObjectMapper objectMapper;
  @Autowired
  private StudentRepository studentRepository;
  @Autowired
  private ModuleRepository moduleRepository;
  Student student;
  Module module;
  @BeforeEach
  void beforeEach() {
    student = new Student();
    student.setId(1010L);
    student = studentRepository.save(student);
  }
  @Test
  void addGradeTest() throws JsonProcessingException, Exception {
    Map<String, Integer> params = new HashMap<String, Integer>();
    params.put("student_id", 1);
    params.put("score", 4);
    params.put("module_id", 1);
    MvcResult action = mockMvc.perform(MockMvcRequestBuilders.post("/grades/addGrade")
        .contentType(MediaType.APPLICATION_JSON)
        .content(objectMapper.writeValueAsString(params))
        .accept(MediaType.APPLICATION_JSON)
        ).andReturn();
  }
}

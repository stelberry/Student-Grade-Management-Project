package uk.ac.rhul.cs2800.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ModuleTest {

  @Test
  void moduleTest() {
    // Test6
    Module module = new Module();
    module.setCode(101);
    module.setName("Software Engineering");
    module.setMnc(true);

    assertEquals(101, module.getCode());
    assertEquals("Software Engineering", module.getName());
    assertEquals(true, module.isMnc());
  }
}

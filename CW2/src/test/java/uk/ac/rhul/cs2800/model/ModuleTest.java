package uk.ac.rhul.cs2800.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import uk.ac.rhul.cs2800.model.Module;

public class ModuleTest {

  @Test
  void moduleTest() {
    // Test7
    Module module = new Module();
    module.setCode("101");
    module.setName("Software Engineering");
    module.setMnc(true);

    assertEquals("101", module.getCode());
    assertEquals("Software Engineering", module.getName());
    assertTrue(module.isMnc());
  }

  @Test
  void moduleTestwithConstructor() {
    // Test8
    Module module = new Module("101", "Software Engineering", true);
    assertEquals("101", module.getCode());
    assertEquals("Software Engineering", module.getName());
    assertTrue(module.isMnc());
  }
}

package uk.ac.rhul.cs2800.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RateTest {

  @Test
  void rateTest() {
    Rate rate =new Rate();
    rate.setScore(3);
    assertEquals(3, rate.getScore());
  }

  @Test
  void rateTestWithNewConstructor() {
    Rate rate = new Rate(4);
    assertEquals(4, rate.getScore());
  }
}

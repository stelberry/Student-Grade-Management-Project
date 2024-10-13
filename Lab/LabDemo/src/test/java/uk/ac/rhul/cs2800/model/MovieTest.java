package uk.ac.rhul.cs2800.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import uk.ac.rhul.cs2800.exception.NoRateAvailableException;

public class MovieTest {

  @Test
  void getAverageTest() throws NoRateAvailableException {
    // Test 1
    Movie movie = new Movie();
    movie.addRate(new Rate(5));
    movie.addRate(new Rate(3));
    assertEquals(4.0, movie.getAverageRate());

  }

  @Test
  void getAverageTestWithoutRates() {
    // Test 2
    assertThrows(NoRateAvailableException.class, () -> {
      Movie movie = new Movie();
      movie.getAverageRate();
    });
  }
}

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

  @Test
  void getPlayTimeTest() {

    Movie movie = new Movie();

    PlayTime playtime = new PlayTime();
    playtime.setWeekday(Weekday.MONDAY);
    playtime.setStartHour(14);
    playtime.setStartMinute(0);
    playtime.setDuration(90);
    movie.addPlayTime(playtime);


    assertEquals(Weekday.MONDAY, movie.getPlayTime().get(0).getWeekday());
    assertEquals(14, movie.getPlayTime().get(0).getStartHour());
    assertEquals(0, movie.getPlayTime().get(0).getStartMinute());
    assertEquals(90, movie.getPlayTime().get(0).getDuration());
  }
}

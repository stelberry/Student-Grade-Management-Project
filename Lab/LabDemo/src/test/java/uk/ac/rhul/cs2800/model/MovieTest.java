package uk.ac.rhul.cs2800.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uk.ac.rhul.cs2800.exception.NoPlayTimeException;
import uk.ac.rhul.cs2800.exception.NoRateAvailableException;

public class MovieTest {

  private static final String MOVIE_TITLE = "Deadpool";
  Movie movie;


  @BeforeEach
  void beforeEqch() {
    movie = new Movie();
    movie.setTitle(MOVIE_TITLE);

  }

  @Test
  void getAverageTest() throws NoRateAvailableException {
    // Test 1
    movie.addRate(new Rate(5));
    movie.addRate(new Rate(3));
    assertEquals(4.0, movie.getAverageRate());
    assertEquals(MOVIE_TITLE, movie.getTitle());

  }

  @Test
  void getAverageTestWithoutRates() {
    // Test 2
    assertThrows(NoRateAvailableException.class, () -> {
      movie.getAverageRate();
    });
  }

  @Test
  void getPlayTimeTest() throws NoPlayTimeException {

    PlayTime playtime = new PlayTime();
    playtime.setWeekday(Weekday.MONDAY);
    playtime.setStartHour(14);
    playtime.setStartMinute(0);
    playtime.setDuration(90);
    movie.addPlayTime(playtime);


    PlayTime playtimeInMovie = movie.getPlayTime().get(0);
    assertEquals(Weekday.MONDAY, playtimeInMovie.getWeekday());
    assertEquals(14, playtimeInMovie.getStartHour());
    assertEquals(0, playtimeInMovie.getStartMinute());
    assertEquals(90, playtimeInMovie.getDuration());
  }
  
  @Test
  void noPlayTimeTest() {
    assertThrows(NoPlayTimeException.class, () -> {
      movie.getPlayTime();
    });

  }
}

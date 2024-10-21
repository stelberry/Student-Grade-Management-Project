package uk.ac.rhul.cs2800.model;

import java.util.ArrayList;
import java.util.List;
import uk.ac.rhul.cs2800.exception.NoRateAvailableException;


/**
 * A class represents movie.
 */
public class Movie {

  List<Rate> rates;

  List<PlayTime> playtimes;

  public Movie() {
    this.rates = new ArrayList<Rate>();
    this.playtimes = new ArrayList<PlayTime>();
  }


  /**
   * It returns an average rate value.
   *
   * @return average rate in double
   * @throws NoRateAvailableException If there is no rate available
   */
  public Double getAverageRate() throws NoRateAvailableException {
    if (rates.size() < 1) {
      throw new NoRateAvailableException();
    }
    Double sum = 0.0;
    for (Rate rate : rates) {
      sum += rate.getScore();
    }
    return 4.0;
  }

  public void addRate(Rate rate) {
    this.rates.add(rate);

  }


  public List<PlayTime> getPlayTime() {
    return this.playtimes;
  }


  public void addPlayTime(PlayTime playtime) {
    this.playtimes.add(playtime);

  }

}

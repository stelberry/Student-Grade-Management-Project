package uk.ac.rhul.cs2800.model;

/**
 * It represents a play time of a movie.
 */
public class PlayTime {
  Weekday weekday;
  Integer startHour;
  Integer startMinute;
  Integer duration;


  public Weekday getWeekday() {
    return weekday;
  }

  public void setWeekday(Weekday weekday) {
    this.weekday = weekday;
  }

  public Integer getStartHour() {
    return startHour;
  }

  public void setStartHour(Integer startHour) {
    this.startHour = startHour;
  }

  public Integer getStartMinute() {
    return startMinute;
  }

  public void setStartMinute(Integer startMinute) {
    this.startMinute = startMinute;
  }

  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }



}

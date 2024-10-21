package uk.ac.rhul.cs2800.model;

/**
 * It represents a weekday.
 */
public enum Weekday {
  MONDAY("Monday"), TUESDAY("Tuesday"), WEDNESDAY("Wednesday"), THURSDAY("Thursday"), FRIDAY(
      "Friday"), SATURDAY("Saturday"), SUNDAY("Sunday");

  final String label;

  Weekday(String label) {
    this.label = label;
  }
}

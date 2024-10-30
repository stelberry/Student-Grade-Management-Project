package uk.ac.rhul.cs2800.exception;

/**
 * Exception for student class if there is no registration.
 */
public class NoRegistrationException extends Exception {

  private static final long serialVersionUID = 1L;

  public NoRegistrationException(String string) {
    super(string);
  }

}

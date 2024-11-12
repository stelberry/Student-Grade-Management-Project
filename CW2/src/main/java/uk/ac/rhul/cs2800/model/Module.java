package uk.ac.rhul.cs2800.model;

/**
 * A class represents a student module.
 */
public class Module {

  private String code;
  private String name;
  private boolean mnc;

  public Module() {

  }

  /**
   * Constructs a Module with the specified code, name, and mandatory status.
   *
   * @param code the unique code of the module
   * @param name the name of the module
   * @param mnc true if the module is mandatory non-condonable, false otherwise
   */
  public Module(String code, String name, boolean mnc) {
    this.code = code;
    this.name = name;
    this.mnc = mnc;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public boolean isMnc() {
    return mnc;
  }

  public void setMnc(boolean mnc) {
    this.mnc = mnc;
  }
}


package uk.ac.rhul.cs2800.model;

public class Module {

  int code;
  String name;
  boolean mnc;

  public Module() {

  }

  public Module(int code, String name, boolean mnc) {
    this.code = code;
    this.name = name;
    this.mnc = mnc;
  }


  public int getCode() {
    return code;
  }

  public void setCode(int code) {
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

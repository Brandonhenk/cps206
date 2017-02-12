package edu.jalc.inclass.lab.display;

public class DisplayTpye{
  private String analog;
  private String digital;

  public DisplayType(String analog, String digital){
    this.analog = analog;
    this.digital = digital;
  }
  public String getAnalog(){return this.analog;}

  public String getDigital(){return this.digital;}

}

package edu.jalc.inclass.lab.display;

public class DisplayTpye{
  private String type;

  public DisplayType(String type){
    if (type.toLowerCase() == "analog"){
      this.type == "Analog";
    }
    else {this.type == "Digital";}
  }

  public String getType(){return this.type;}
}

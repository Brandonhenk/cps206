package edu.jalc.inclass.lab.display;

public class Display{
  private final double numbers;
  private DisplayType displaytype;

  public Display(double numbers, DisplayType displaytype){
    this.numers = numbers;
    this.displaytype = displaytype;
  }

  public double getNumbers(){return this.numers;}

  public DiplayType getDisplayType(){ return this.displaytype;}
}

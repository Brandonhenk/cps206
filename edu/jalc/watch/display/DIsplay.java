package edu.jalc.watch.display;

public class Display{
  private final double numbers;
  private DisplayType displaytype;

  public Display(double numbers, DisplayType displaytype){
    this.numers = numbers;
    this.setDisplayType(displaytype);
  }

  public double getNumbers(){return this.numers;}

  public DiplayType getDisplayType(){ return this.displaytype;}

  DisplayType setDisplayType(DisplayType displaytype){
    this.displaytype = displaytype;
    return this.display;
  }
}

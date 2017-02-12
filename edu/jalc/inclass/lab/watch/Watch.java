package edu/jalc/inclass/lab;

class Watch{

  private double bandlength;
  private Display display;
  private Material material;
  private final double circumference;

  public Watch(double bandlength, Display display, Material material, double circumference){
    this.bandlength = bandlength;
    this.diplay = display;
    this.material = material;
    this.circumference = circumference;
  }

  public double getBandLength(){
    return this.bandlength;
  }

  public Display getDisplay(){
    return this.display;
  }

  public Material getMaterial(){
    return this.material;
  }

  public double getCircumference(){
    return this.circumference;
  }

}

package edu.jalc.inclass.image;

public class Image{

  private final double height;

  private Image(){
    this.height = 0;
  }

  public Image(double height){
    this.height = height;
  }

  public double getHeight(){
    return this.height;
  }
}

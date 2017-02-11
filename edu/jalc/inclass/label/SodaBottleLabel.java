package edu.jalc.inclass.label;

import edu.jalc.inclass.color.Color;
import edu.jalc.inclass.image.Image;

class SodaBottleLabel{
  private final double text;
  private Image image;
  private Color color;

  public SodaBottleLabel(double text, Image image, Color color){
    this.text = text;
    this.image = image;
    this.color = color;
  }


  double getText(){return text;}
  Image getImage(){return this.image;}
  Color getColor(){return this.color;}

}

package edu.jalc.inclass.label;

import edu.jalc.inclass.color.Color;
import edu.jalc.inclass.image.Image;

class SodaBottleLabel{
  private final double text;
  private Image image;
  private Color color;

  private SodaBottleLabel(){
    this.text = 2.0;
    this.setImage(null);
    this.setColor(null);
  }

  public void setText(double text){
    text = text;
  }

  public void setImage(Image image){
    this.image = image;
    //return this.image;
  }

  public void setColor(Color color){
    this.color = color;
    //return this.color;
  }

  double getText(){return text;}
  Image getImage(){return this.image;}
  Color getColor(){return this.color;}

}

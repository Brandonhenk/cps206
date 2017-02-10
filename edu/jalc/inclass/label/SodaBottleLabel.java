package edu.jalc.inclass.label;

import edu.jalc.inclass.color.Color;
import edu.jalc.inclass.image.Image;

class SodaBottleLabel{
  private final String text;
  private Image image;
  private Color color;

  private SodaBottleLabel(){
    this.text = "Coca-Cola";
    this.setImage(null);
    this.setColor(null);
  }

  public void setText(String text){
    text = text;
  }

  public void setImage(Images image){
    this.image = image;
    return this;
  }

  public void setColor(Color color){
    this.color = color;
    return this;
  }

  double getText(){return image;}
  Image getImage(){return this.image;}
  Color getColor(){return this.color;}

}

package edu.jalc.inclass.label;

class SodaBottleLabel{
  private final String text;
  private SodaBottleImage image;
  private SodaBottleColor color;

  private SodaLabel(){
    this.text = "Coca-Cola";
    this.setImages(image);
    this.setColor(color);
  }

  public void setText(String text){
    text = text;
  }

  public void setImages(Images image){
    this.image = image;
    return this;
  }

  public void setColor(Color color){
    this.color = color;
    return this;
  }

  double getText(){return image;}
  SodaBottleImage getImages(){return this.image;}
  SodaBottleColor getColor(){return this.color;}

}

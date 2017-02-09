package edu.jalc.inclass.label;

class SodaBottleLabel{
  private final String text;
  private Image image;
  private Color color;

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
  Images getImages(){return this.image;}
  Color getColor(){return this.color;}

}

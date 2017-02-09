package edu.jalc.inclass.label;

class SodaLabel{
  private String text;
  private Images images;
  private Color color;

  public void setText(String txt){
    text = txt;
  }
  public void setImages(Images image){
    images = image;
  }
  public void setColor(Color color1){
    color = color1;
  }

  private SodaLabel(){
    this.text = "null";
    this.images = null
    this.color = null
  }

}

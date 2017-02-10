package edu.jalc.inclass.color;

public class Color{

  private final byte red;
  private final byte blue;
  private final byte green;

  private Color(){
    this.red = this.blue = this.green = 0;
  }

  public Color(byte red, byte blue, byte green){
    this.red = red;
    this.blue = blue;
    this.green = green;
  }

  public byte getRed(){
    return red;
  }
  public byte getBlue(){
    return blue;
  }
  public byte getGreen(){
    return green;
  }
}

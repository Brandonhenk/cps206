package edu.jalc.inlcass.label;

import edu.jalc.inclass.color.Color;
import edu.jalc.inclass.image.Image;

public class SodaBottleLabelTest{

  public void testSetText(){
    System.out.println("Testing SodaBottleLabel: getText()");
    SodaBottleLabel sodaBottleLabel = new SodaBottleLabel(2.0,null,null);
    assert(sodaBottleLabel.getText == 2.0);
  }

  public void testSetColor(){
    System.out.println("Testing SodaBottleLabel: getColor()");
    Color color = new Color((byte)1, (byte)1, (byte)1);
    SodaBottleLabel sodaBottleLabel = new SodaBottleLabel(2.0,null,color);
    assert(sodaBottleLabel.getColor() == color);
  }

  public void testSetImage(){
    System.out.println("Testing SodaBottleLabel: getImage()");
    Image image = new Image(1.0);
    SodaBottleLabel sodaBottleLabel = new SodaBottleLabel(1.0,image,color);
    assert(sodaBottleLabel.getImage() == image);
  }

  public static void main(String[] args){
    SodaBottleLabelTest sodaBottleLabelTest = new SodaBottleLabelTest();
    sodaBottleLabelTest.testSetText();
    sodaBottleLabelTest.testSetColor();
    sodaBottleLabelTest.testSetImage();
    System.out.println("Test Complete");
  }


}

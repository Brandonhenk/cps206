package edu.jalc.inlcass.label;

import edu.jalc.inclass.color.Color;
import edu.jalc.inclass.image.Image;

public class SodaBottleLabelTest{

  public void testSetText(){
    System.out.println("Testing SodaBottleLabel: setText()");
    SodaBottleLabel sodaBottleLabel = new SodaBottleLabel("Coke",null,null);
    assert(sodaBottleLabel.getText == "Coke");
  }

  public void testSetColor(){
    System.out.println("Testing SodaBottleLabel: setColor()");
    Color color = new Color((byte)1, (byte)1, (byte)1);
    SodaBottleLabel sodaBottleLabel = new SodaBottleLabel("Coke",null,color);
    assert(sodaBottleLabel.setColor() == color);
  }

  public void testSetImage(){
    System.out.println("Testing SodaBottleLabel: setImage()");
    Image image = new Image(1.0)
    SodaBottleLabel sodaBottleLabel = new SodaBottleLabel("Coke",image,color);
    assert(sodaBottleLabel.setImage() == image);
  }

  public static void main(String[] args){
    SodaBottleLabelTest sodaBottleLabelTest = new SodaBottleLabelTest();
    sodaBottleLabelTest.testSetText();
    sodaBottleLabelTest.testSetColor();
    sodaBottleLabelTest.testSetImage();
    System.out.println("Test Complete");
  }


}

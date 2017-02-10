package edu.jalc.inclass.color;

public class ColorTest{

  public void testGetRed(){
    System.out.println("Testing Color: getRed");
    Color color = new Color((byte)1, (byte)1, (byte)1);
    assert(Color.getRed() == (byte)1);
  }

  public void testGetBlue(){
    System.out.println("Testing Color: getBlue");
    Color color = new Color((byte)1, (byte)1, (byte)1);
    assert(Color.getBlue() == (byte)1);
  }

  public void testGetGreen(){
    System.out.println("Testing Color: getGreen");
    Color color = new Color((byte)1, (byte)1, (byte)1);
    assert(Color.getGreen() == (byte)1);
  }
  public static void main(String[] args){
    ColorTest colorTest = new ColorTest();
    colorTest.testGetRed();
    colorTest.testGetBlue();
    colorTest.testGetGreen();
    System.out.println("Test is complete");
  }
}

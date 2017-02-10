package edu.jalc.inclass.image;

public class ImageTest{

  public void testGetHeight(){
    System.out.println("Testing Image: getHeight()");
    Image image = new Image(1.0);
    assert(Image.getHeight() == 1.0);
  }

  public static void main(String[] args){
    ImageTest imageTest = new ImageTest;
    imageTest.testGetHeight();
    System.out.println("ImageTest completed");
  }
}

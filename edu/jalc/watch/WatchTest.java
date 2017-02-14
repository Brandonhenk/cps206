package edu.jalc.watch;

public class WatchTest{

  public void getTimeTest(){
    System.out.println("Testing Watch: getTime");
    Watch watch = new Watch(1.0,null,null,10.0);
    assert(Watch.getTime() == 1.0);
  }

  public void getDisplayTest(){
    System.out.println("Testing Watch: getDisplay");
    DisplayType displaytype = new DisplayType(type)
    Display display = new Display(1.0,displaytype)
    Watch watch = new Watch(1.0,display,null,10.0);
    assert(Watch.getDisplay() == display);
  }

  public void getMaterialTest(){
    System.out.println("Testing Watch: getMaterial");
    MaterialColor color = new MaterialColor(1)
    Material material = new Material(null,null,color)
    Watch watch = new Watch(1.0,null,material,10.0);
    assert(Watch.getMaterial() == material);
  }

}

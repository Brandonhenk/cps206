package edu.jalc.watch;






class Watch{

  private final double time;
  private Display display;
  private Material material;
  private final double circumference;

  public Watch(double time, Display display, Material material, double circumference){
    this.time = time;
    this.setDiplay(display);
    this.setMaterial(material);
    this.circumference = circumference;
  }

  public double getTime(){
    return this.time;
  }

  public Display getDisplay(){
    return this.display;
  }

  public Material getMaterial(){
    return this.material;
  }

  public double getCircumference(){
    return this.circumference;
  }
  Display setDisplay(Display display){
    this.display = display;
    return this.display;
  }
  Material setMaterial(Material material){
    this.material = material;
    return this.material;
  }

}

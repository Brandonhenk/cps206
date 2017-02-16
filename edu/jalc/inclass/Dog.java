public class Dog{
  public String name;
  public Dog(String name){
    this.name = name;
  }
  /*public boolean equals(Object other){
    Dog dog = (Dog)other;
    return this.name.equals(dog name); //&& superequals(other);
  }*/

  public String toString(){
    return "My name is " + this.name;
  }
  public int hashCode(){
    return super.hashCode()%32;
  }
  //Over Riding and over loading
}

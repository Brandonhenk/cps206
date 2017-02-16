public class Driver{
  public static void main(String[] args){
  Dog fido = new Dog("fido");
  Dog spot = new Dog("fido");
  System.out.println(fido.equals(spot));
  System.out.println(fido);//Super Useful!!!
  System.out.println(fido.hashCode());
}
}

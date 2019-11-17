package prototype;

public class PrototypeDemo
{
  public static void main(String[] args)
  {
    ColorStore.getColor("Black").addColor();
    ColorStore.getColor("Red").addColor();
    ColorStore.getColor("Red").addColor();
    ColorStore.getColor("Black").addColor();
  }
}
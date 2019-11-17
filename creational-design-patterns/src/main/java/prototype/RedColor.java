package prototype;

public class RedColor extends Color
{
  public RedColor()
  {
    this.colorName = "Red";
  }

  @Override
  void addColor()
  {
    System.out.println("Added red color");
  }
}

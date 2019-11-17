package prototype;

public class BlackColor extends Color
{

  public BlackColor()
  {
    this.colorName = "Black";
  }

  @Override
  void addColor()
  {
    System.out.println("Added black color");
  }
}

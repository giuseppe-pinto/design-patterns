package adapter;

public class Sparrow implements Bird
{
  @Override
  public void fly()
  {
    System.out.println("Fly...");
  }

  @Override
  public void makeSound()
  {
    System.out.println("Chip chip");
  }
}

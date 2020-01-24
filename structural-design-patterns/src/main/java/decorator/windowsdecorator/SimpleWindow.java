package decorator.windowsdecorator;

public class SimpleWindow implements Window
{
  public void draw()
  {
    System.out.println("I draw a simple window");
  }

  public String getDescription()
  {
    return "Simple window";
  }
}

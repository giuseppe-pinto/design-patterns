package decorator.component;

import decorator.component.Pizza;

public class Margherita extends Pizza
{

  public Margherita()
  {
    description = "Margherita";
  }

  @Override
  public int getCost()
  {
    return 100;
  }
}

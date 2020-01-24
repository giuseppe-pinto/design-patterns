package decorator.component;

import decorator.component.Pizza;

public class ChickenFiesta extends Pizza
{
  public ChickenFiesta()
  {
    description = "ChickenFiesta";
  }

  @Override
  public int getCost()
  {
    return 200;
  }
}

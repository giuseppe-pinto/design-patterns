package decorator.component;

import decorator.component.Pizza;

public class SimplePizza extends Pizza
{

  public SimplePizza()
  {
    description = "Simple pizza";
  }

  @Override
  public int getCost()
  {
    return 50;
  }
}

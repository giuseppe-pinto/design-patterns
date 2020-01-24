package decorator.component;

import decorator.component.Pizza;

public class PeppyPaneer extends Pizza
{

  public PeppyPaneer()
  {
    description = "PeppyPaneer";
  }

  @Override
  public int getCost()
  {
    return 100;
  }
}

package decorator.pizzastore.component;

public class FarmHouse extends Pizza
{

  public FarmHouse()
  {
    description = "Farm House";
  }

  @Override
  public int getCost()
  {
    return 200;
  }
}

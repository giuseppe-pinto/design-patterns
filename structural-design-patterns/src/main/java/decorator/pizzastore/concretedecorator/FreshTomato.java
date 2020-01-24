package decorator.pizzastore.concretedecorator;

import decorator.pizzastore.component.Pizza;

public class FreshTomato extends ToppingsPizza
{
  // we need a reference to obj we are decorating
  private Pizza pizza;

  public FreshTomato(Pizza pizza)
  {
    this.pizza = pizza;
  }

  @Override
  public String getDescription()
  {
    return pizza.getDescription() + ", Fresh Tomato";
  }

  @Override
  public int getCost()
  {
    return pizza.getCost() + 40;
  }
}

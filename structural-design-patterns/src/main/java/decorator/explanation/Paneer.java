package decorator.explanation;

import decorator.pizzastore.component.Pizza;
import decorator.pizzastore.concretedecorator.ToppingsPizza;

public class Paneer extends ToppingsPizza
{
  Pizza pizza;

  public Paneer(Pizza pizza)
  {
    this.pizza = pizza;
  }

  @Override
  public String getDescription()
  {
    return this.pizza.getDescription() + ", Paneer";
  }

  @Override
  public int getCost()
  {
    return this.pizza.getCost() + 70;
  }
}

package decorator.pizzastore.concretedecorator;

import decorator.pizzastore.component.Pizza;

public class Barbeque extends ToppingsPizza
{
  private Pizza pizza;

  public Barbeque(Pizza pizza)
  {
    this.pizza = pizza;
  }

  @Override
  public String getDescription()
  {
    return this.pizza.getDescription() + ", Barbeque";
  }

  @Override
  public int getCost()
  {
    return this.pizza.getCost() + 90;
  }
}

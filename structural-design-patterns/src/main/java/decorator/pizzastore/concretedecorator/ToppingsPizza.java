package decorator.pizzastore.concretedecorator;


import decorator.pizzastore.component.Pizza;

// The decorator class :  It extends Pizza to be
// interchangable with it topings decorator can
// also be implemented as an interface
public abstract class ToppingsPizza extends Pizza
{
  public abstract String getDescription();
}

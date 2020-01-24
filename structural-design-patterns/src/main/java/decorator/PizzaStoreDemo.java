package decorator;

import decorator.component.FarmHouse;
import decorator.component.Margherita;
import decorator.component.Pizza;
import decorator.concretedecorator.FreshTomato;
import decorator.explanation.Paneer;

public class PizzaStoreDemo
{

  public static void main(String[] args)
  {
    // create new margherita pizza
    Pizza pizza = new Margherita();
    System.out.println(pizza.getDescription() + " Cost :" + pizza.getCost());

    // create new FarmHouse pizza
    Pizza pizza2 = new FarmHouse();

    // decorate it with freshtomato topping
    pizza2 = new FreshTomato(pizza2);

    //decorate it with paneer topping
    pizza2 = new Paneer(pizza2);

    System.out.println(pizza2.getDescription() + " Cost :" + pizza2.getCost());

  }

}


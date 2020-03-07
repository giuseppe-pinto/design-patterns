package memento;

import java.util.ArrayList;
import java.util.List;

public class Demo
{

  public static void main(String[] args)
  {
    List<Memento> savedTimes = new ArrayList<>();

    Life life = new Life();

    life.setTime("1000 B.C.");
    savedTimes.add(life.saveToMemento());
    life.setTime("1000 A.D.");
    savedTimes.add(life.saveToMemento());
    life.setTime("2000 A.D.");
    savedTimes.add(life.saveToMemento());
    life.setTime("4000 A.D.");

    life.restoreFromMemento(savedTimes.get(0));

    System.out.println("--------------------------------");

    Life lifeNew = new Life();
    lifeNew.setTime("200 BC");
    Memento memento = lifeNew.saveToMemento();
    lifeNew.setTime("400 bc");
    System.out.println("Something gone wrong! Get old value of time!");
    life.restoreFromMemento(memento);

  }

}

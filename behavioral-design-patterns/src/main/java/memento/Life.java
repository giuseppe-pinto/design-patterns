package memento;

public class Life
{
  private String time;

  public Memento saveToMemento(){
    System.out.println("Saving time to memento");
    return new Memento(time);
  }

  public void restoreFromMemento(Memento memento){
    time = memento.getSavedTime();
    System.out.println("Time restored from Memento: " + time);
  }

  public void setTime(String time)
  {
    System.out.println("Setting time to " + time);
    this.time = time;
  }
}

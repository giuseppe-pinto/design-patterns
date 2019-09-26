package bridge;

public class Car extends Vehicle
{
  public Car(Workshop workshopOne, Workshop workshopTwo)
  {
    super(workshopOne, workshopTwo);
  }

  @Override
  public void manufacture()
  {
    System.out.println("Car");
    workshopOne.work();
    workshopTwo.work();
  }
}
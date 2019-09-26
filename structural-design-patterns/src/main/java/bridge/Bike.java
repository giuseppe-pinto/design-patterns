package bridge;

public class Bike extends Vehicle
{
  Bike(Workshop workshopOne, Workshop workshopTwo)
  {
    super(workshopOne, workshopTwo);
  }

  @Override
  public void manufacture()
  {
    System.out.println("Bike");
    workshopOne.work();
    workshopTwo.work();
  }
}
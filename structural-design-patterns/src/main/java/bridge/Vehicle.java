package bridge;

public abstract class Vehicle
{
  protected Workshop workshopOne;
  protected Workshop workshopTwo;

  Vehicle(Workshop workshopOne, Workshop workshopTwo)
  {
    this.workshopOne = workshopOne;
    this.workshopTwo = workshopTwo;
  }

  abstract public void manufacture();

}
package flyweight;

public class Car implements Vehicle
{

  private Color color;
  private Engine engine;

  public Car(Color color, Engine engine)
  {
    this.color = color;
    this.engine = engine;

    // Building a new car is a very expensive operation!
    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      System.out.println("Error while creating a new car " + e);
    }

  }

  @Override
  public void start()
  {
    System.out.println("Car is starting!");
    engine.start();
  }

  @Override
  public void stop()
  {
    System.out.println("Car is stopping!");
    engine.stop();
  }

  @Override
  public Color getColor()
  {
    return this.color;
  }
}

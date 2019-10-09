package abstractfactory.factory;

import abstractfactory.domain.Car;
import abstractfactory.domain.CarType;
import abstractfactory.domain.Location;

public class CarFactory
{
  private CarFactory()
  {

  }
  public static Car buildCar(CarType type, Location location)
  {
    Car car;

    switch(location)
    {
      case USA:
        car = USACarFactory.buildCar(type);
        break;

      case INDIA:
        car = INDIACarFactory.buildCar(type);
        break;

      default:
        car = DefaultCarFactory.buildCar(type);

    }

    return car;

  }
}
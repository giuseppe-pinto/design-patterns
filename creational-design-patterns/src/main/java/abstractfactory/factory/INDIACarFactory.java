package abstractfactory.factory;

import abstractfactory.domain.Car;
import abstractfactory.domain.CarType;
import abstractfactory.domain.Location;
import abstractfactory.domain.LuxuryCar;
import abstractfactory.domain.MicroCar;
import abstractfactory.domain.MiniCar;

public class INDIACarFactory
{
  static Car buildCar(CarType model)
  {
    Car car = null;
    switch (model)
    {
      case MICRO:
        car = new MicroCar(Location.INDIA);
        break;

      case MINI:
        car = new MiniCar(Location.INDIA);
        break;

      case LUXURY:
        car = new LuxuryCar(Location.INDIA);
        break;

      default:
        break;

    }
    return car;
  }
}

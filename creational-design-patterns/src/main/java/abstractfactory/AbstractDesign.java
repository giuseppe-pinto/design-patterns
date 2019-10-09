package abstractfactory;

import abstractfactory.domain.CarType;
import abstractfactory.domain.Location;
import abstractfactory.factory.CarFactory;

public class AbstractDesign
{

  public static void main(String[] args)
  {
    System.out.println(CarFactory.buildCar(CarType.MICRO, Location.INDIA));
    System.out.println(CarFactory.buildCar(CarType.MINI, Location.INDIA));
    System.out.println(CarFactory.buildCar(CarType.LUXURY, Location.USA));
  }

}

package builder;

import builder.director.CivilEngineer;
import builder.domain.House;

public class BuilderDemo
{

  public static void main(String[] args)
  {
    HouseBuilder iglooHouseBuilder = new IglooHouseBuilder();

    CivilEngineer civilEngineer = new CivilEngineer(iglooHouseBuilder);

    civilEngineer.constructHouse();

    House house = civilEngineer.getHouse();

    System.out.println(house.toString());

  }

}
package builder.director;

import builder.HouseBuilder;
import builder.domain.House;

public class CivilEngineer
{
  private final HouseBuilder houseBuilder;

  public CivilEngineer(HouseBuilder houseBuilder)
  {
    this.houseBuilder = houseBuilder;
  }

  public House getHouse(){
    return this.houseBuilder.getHouse();
  }

  public void constructHouse(){
    this.houseBuilder.buildBasement();
    this.houseBuilder.buildInterior();
    this.houseBuilder.buildRoof();
    this.houseBuilder.buildStructure();
  }

}
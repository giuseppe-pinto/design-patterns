package builder;

import builder.domain.House;

public class TipiHouseBuilder implements HouseBuilder
{
  private House house;

  public TipiHouseBuilder()
  {
    this.house = new House();
  }

  @Override
  public void buildBasement()
  {
    this.house.setBasement("Wooden Poles");
  }

  @Override
  public void buildStructure()
  {
    this.house.setStructure("Wood and Ice");
  }

  @Override
  public void buildRoof()
  {
    this.house.setRoof("Wood, caribou and seal skins");
  }

  @Override
  public void buildInterior()
  {
    this.house.setInterior("Fire Wood");
  }

  @Override
  public House getHouse()
  {
    return this.house;
  }
}

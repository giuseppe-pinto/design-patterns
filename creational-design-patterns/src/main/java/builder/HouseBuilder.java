package builder;

import builder.domain.House;

public interface HouseBuilder
{
  void buildBasement();
  void buildStructure();
  void buildRoof();
  void buildInterior();
  House getHouse();
}
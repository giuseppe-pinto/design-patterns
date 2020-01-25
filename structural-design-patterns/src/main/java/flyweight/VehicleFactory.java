package flyweight;

import java.util.HashMap;
import java.util.Map;

public class VehicleFactory
{
  private static Map<Color, Vehicle> colorVehicleCache = new HashMap<>();

  public VehicleFactory()
  {
  }

  public Vehicle createVehicle(Color color){

    // Looks for the requested vehicle into the cache.
    // If the vehicle doesn't exist, a new one is created.
    Vehicle newVehicle = colorVehicleCache.computeIfAbsent(color, newColor -> {
      // Creates the new car.
      System.out.println("Creating new vehicle...");
      Engine engine = new Engine();
      return new Car(newColor, engine);
    });

    return newVehicle;
  }

}

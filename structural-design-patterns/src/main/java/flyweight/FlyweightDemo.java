package flyweight;

public class FlyweightDemo
{

  public static void main(String[] args)
  {
    VehicleFactory vehicleFactory = new VehicleFactory();

    Color red = new Color("#CFF5687", "red");

    Vehicle vehicleRed = vehicleFactory.createVehicle(red);

    System.out.println(vehicleRed.getColor());
    vehicleRed.start();
    vehicleRed.stop();

    Color black = new Color("#AAAA111","black");

    Vehicle vehicleBlack = vehicleFactory.createVehicle(black);
    System.out.println(vehicleBlack.getColor());
    vehicleBlack.start();
    vehicleBlack.stop();

    Vehicle vehicleRedNew = vehicleFactory.createVehicle(red);
    System.out.println(vehicleRedNew.getColor());
    vehicleRedNew.start();
    vehicleRedNew.stop();

  }




}

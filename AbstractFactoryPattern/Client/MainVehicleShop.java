package AbstractFactoryPattern.Client;

import AbstractFactoryPattern.Factory.LuxuryVehicleFactory;
import AbstractFactoryPattern.Factory.VehicleFactory;

public class MainVehicleShop {
    public static void main(String[] args) {
        System.out.println("--- Building a Luxury Factory ---");
        VehicleFactory luxuryFactory = new LuxuryVehicleFactory();
        BigFactory luxuryBigFactory = new BigFactory(luxuryFactory);
        luxuryBigFactory.CreateAndDriveVehicles();
    }
}

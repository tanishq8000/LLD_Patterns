package AbstractFactoryPattern.Client;

import AbstractFactoryPattern.Factory.VehicleFactory;
import AbstractFactoryPattern.Models.Vehicle;

public class BigFactory {
    private VehicleFactory vehicleFactory;
    public BigFactory(VehicleFactory vehicleFactory){
        this.vehicleFactory = vehicleFactory;
    }

    public void CreateAndDriveVehicles(){
        Vehicle vehicle1 = vehicleFactory.CreateVehicle1();
        vehicle1.drive();

        Vehicle vehicle2 = vehicleFactory.CreateVehicle2();
        vehicle2.drive();
    }
}

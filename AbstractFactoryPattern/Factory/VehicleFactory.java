package AbstractFactoryPattern.Factory;

import AbstractFactoryPattern.Models.Vehicle;

public interface VehicleFactory {
    Vehicle CreateVehicle1();
    Vehicle CreateVehicle2();
}

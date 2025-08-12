package AbstractFactoryPattern.Factory;

import AbstractFactoryPattern.Models.Ordinary1;
import AbstractFactoryPattern.Models.Ordinary2;
import AbstractFactoryPattern.Models.Vehicle;

public class OrdinaryVehicleFactory implements VehicleFactory{
    @Override
    public Vehicle CreateVehicle1(){
        return new Ordinary1();
    }
    @Override
    public Vehicle CreateVehicle2(){
        return new Ordinary2();
    }
}

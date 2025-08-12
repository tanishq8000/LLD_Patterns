package AbstractFactoryPattern.Factory;

import AbstractFactoryPattern.Models.Luxury1;
import AbstractFactoryPattern.Models.Luxury2;
import AbstractFactoryPattern.Models.Vehicle;

public class LuxuryVehicleFactory implements VehicleFactory{
    @Override
    public Vehicle CreateVehicle1(){
        return new Luxury1();
    }
    @Override
    public Vehicle CreateVehicle2(){
        return new Luxury2();
    }
}

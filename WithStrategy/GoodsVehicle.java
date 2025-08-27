package WithStrategy;

import WithStrategy.Strategy.NormaDriveCapability;

public class GoodsVehicle extends Vehicle{
    GoodsVehicle(){
        super(new NormaDriveCapability());
    }
}

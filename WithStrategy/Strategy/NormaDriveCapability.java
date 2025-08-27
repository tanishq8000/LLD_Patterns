package WithStrategy.Strategy;

public class NormaDriveCapability implements DriveStrategy{
    @Override
    public void drive(){
        System.out.println("Normal Drive Capability");
    }
}

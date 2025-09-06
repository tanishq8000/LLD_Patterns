package Bridge_Design_Pattern;

public class WaterBreathing implements BreathingProcess{
    @Override
    public void breathe(){
        System.out.println("Breathing using Grills");
    }
}

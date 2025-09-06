package Bridge_Design_Pattern;

public class LungBreathing implements BreathingProcess{
    @Override
    public void breathe(){
        System.out.println("Breathing using Lungs");
    }
}

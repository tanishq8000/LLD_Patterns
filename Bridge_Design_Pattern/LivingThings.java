package Bridge_Design_Pattern;

public abstract class LivingThings {
    protected BreathingProcess breathingProcess;

    public LivingThings(BreathingProcess breathingProcess){
        this.breathingProcess = breathingProcess;
    }

    abstract public void breathe();
}

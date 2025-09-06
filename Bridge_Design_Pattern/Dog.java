package Bridge_Design_Pattern;

public class Dog extends LivingThings{
    public Dog(BreathingProcess breathingProcess){
        super(breathingProcess);
    }

    @Override
    public void breathe(){
        System.out.print("Dog ");
        breathingProcess.breathe();
    }
}

package Bridge_Design_Pattern;

public class Tree extends LivingThings{
    public Tree(BreathingProcess breathingProcess){
        super(breathingProcess);
    }

    @Override
    public void breathe(){
        System.out.print("Tree ");
        breathingProcess.breathe();
    }
}

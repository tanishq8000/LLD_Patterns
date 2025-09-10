package Command_Design_Pattern.Command;

import Command_Design_Pattern.Receiver.AirConditioner;

public class TurnACOnCommand implements ICommand{
    AirConditioner ac;
    public TurnACOnCommand(AirConditioner ac){
        this.ac = ac;
    }

    @Override
    public void execute(){
        ac.turnOnAC();
    }

    @Override
    public void undo(){
        ac.turnOffAC();
    }
}

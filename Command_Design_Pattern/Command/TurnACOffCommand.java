package Command_Design_Pattern.Command;

import Command_Design_Pattern.Receiver.AirConditioner;

public class TurnACOffCommand implements ICommand{
    AirConditioner ac;
    public TurnACOffCommand(AirConditioner ac){
        this.ac = ac;
    }

    @Override
    public void execute(){
        ac.turnOffAC();
    }

    @Override
    public void undo(){
        ac.turnOnAC();
    }
}

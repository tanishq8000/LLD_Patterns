package Command_Design_Pattern.Command;

import Command_Design_Pattern.Receiver.AirConditioner;

public class SetTemperatureCommand implements ICommand{
    AirConditioner ac;
    int oldTemp;
    int newTemp;
    public SetTemperatureCommand(AirConditioner ac,int newTemp){
        this.ac = ac;
        this.newTemp = newTemp;
    }

    @Override
    public void execute(){
        oldTemp = ac.temperature;
        ac.setTemperature(newTemp);
        System.out.println("Ac temperature is now set to " + newTemp);
    }

    @Override
    public void undo(){
        ac.setTemperature(oldTemp);
        System.out.println("Undo Done Successfully");
    }
}

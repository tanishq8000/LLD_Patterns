package Command_Design_Pattern;

import Command_Design_Pattern.Command.SetTemperatureCommand;
import Command_Design_Pattern.Command.TurnACOnCommand;
import Command_Design_Pattern.Invoker.MyRemoteControl;
import Command_Design_Pattern.Receiver.AirConditioner;

public class Main {
    public static void main(String[] args) {
        AirConditioner airConditioner = new AirConditioner();
        MyRemoteControl remote = new MyRemoteControl();

        remote.setCommand(new TurnACOnCommand(airConditioner));
        remote.pressButton();

        // Undo the last Operation
        remote.undo();

        remote.setCommand(new SetTemperatureCommand(airConditioner,22));
        remote.pressButton();

        remote.undo();
    }
}

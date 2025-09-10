package Command_Design_Pattern.Receiver;

public class AirConditioner {
    public boolean isOn;
    public int temperature;

    public void turnOnAC(){
        isOn = true;
        System.out.println("AC is ON");
    }

    public void turnOffAC(){
        isOn = false;
        System.out.println("AC is OFF");
    }

    public void setTemperature(int temp){
        this.temperature = temp;
        System.out.println("Temperature changed to : " + temperature);
    }
}

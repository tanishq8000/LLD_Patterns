package Memento_Design_Pattern;

public class Client {
    public static void main(String[] args) {
        ConfigurationCareTaker careTakerObj = new ConfigurationCareTaker();

        ConfigurationOriginator originatorObj = new ConfigurationOriginator(5,7);

        ConfigurationMemento snapshot1 = originatorObj.createMemento();
        careTakerObj.addMemento(snapshot1);

        originatorObj.setHeight(8);
        originatorObj.setWidth(12);

        ConfigurationMemento snapshot2 = originatorObj.createMemento();
        careTakerObj.addMemento(snapshot2);

        originatorObj.setWidth(15);
        originatorObj.setHeight(20);

        System.out.println("Before Undo : Height = " + originatorObj.height + " and Width = " + originatorObj.width);

        ConfigurationMemento restoredStateMementoObj = careTakerObj.undo();
        originatorObj.restoreMemento(restoredStateMementoObj);

        System.out.println("After Undo : Height = " + originatorObj.height + " and Width = " + originatorObj.width);
    }
}

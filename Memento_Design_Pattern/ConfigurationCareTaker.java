package Memento_Design_Pattern;

import java.util.ArrayList;
import java.util.List;

public class ConfigurationCareTaker {
    List<ConfigurationMemento> history = new ArrayList<>();

    public void addMemento(ConfigurationMemento memento){
        history.add(memento);
    }

    public ConfigurationMemento undo(){
        if(!history.isEmpty()){
            int lastIdx = history.size()-1;
            ConfigurationMemento lastMemento = history.get(lastIdx);
            history.remove(lastIdx);
            return lastMemento;
        }
        return null;
    }
}

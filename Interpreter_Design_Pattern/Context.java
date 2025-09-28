package Interpreter_Design_Pattern;

import java.util.HashMap;
import java.util.Map;

public class Context {
    Map<String,Integer> contextMap = new HashMap<>();

    public void put(String str,Integer intValue){
        contextMap.put(str,intValue);
    }

    public int get(String str){
        return contextMap.get(str);
    }
}

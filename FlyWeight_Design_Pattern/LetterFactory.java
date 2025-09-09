package FlyWeight_Design_Pattern;

import java.util.HashMap;
import java.util.Map;

public class LetterFactory {
    private static final Map<Character,ILetter> characterCache = new HashMap<>();

    public static ILetter createLetter(char characterValue){
        if(characterCache.containsKey(characterValue)){
            return characterCache.get(characterValue);
        }
        else{
            DocumentCharacter charObj = new DocumentCharacter(characterValue,"Arial",10);
            characterCache.put(characterValue,charObj);
            return charObj;
        }
    }

    public static int getTotalCharactersCreatedCount(){
        return characterCache.size();
    }
}

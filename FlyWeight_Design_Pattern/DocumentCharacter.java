package FlyWeight_Design_Pattern;

public class DocumentCharacter implements ILetter{
    private final char character;
    private final String fontType;
    private final int size;

    DocumentCharacter(char character,String fontType,int size){
        this.character = character;
        this.fontType = fontType;
        this.size = size;
    }

    @Override
    public void display(int row,int col){
        System.out.println("Displaying " + character + " at row " + row + "and column " + col);
    }
}

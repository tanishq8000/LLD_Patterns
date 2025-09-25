package Memento_Design_Pattern;

public class ConfigurationMemento {
    int width;
    int height;

    public ConfigurationMemento(int height,int width){
        this.height = height;
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }


}

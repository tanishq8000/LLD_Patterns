package Bridge_Design_Pattern;

public class Client {
    public static void main(String[] args) {
        System.out.println("------- Bridge Design Patten Example Demo -------");

        LivingThings dog = new Dog(new LungBreathing());
        LivingThings fish = new Fish(new WaterBreathing());
        LivingThings tree = new Tree(new PhotoSynthesisBreathing());

        dog.breathe();
        fish.breathe();
        tree.breathe();
    }
}

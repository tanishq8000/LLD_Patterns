package DecoratorPattern;

import DecoratorPattern.BasePizzas.Farmhouse;
import DecoratorPattern.BasePizzas.Pizza;
import DecoratorPattern.Decorators.ExtraCheese;
import DecoratorPattern.Decorators.Mushrooms;

public class PizzaShop {
    public static void main(String[] args) {
        Pizza p1 = new Farmhouse();
        p1 = new ExtraCheese(p1);
        System.out.println(p1.cost());
        p1 = new Mushrooms(p1);
        System.out.println(p1.cost());
    }
}

package DecoratorPattern.Decorators;

import DecoratorPattern.BasePizzas.Pizza;

public class Mushrooms extends ToppingDecorator{
    Pizza pizza;
    public Mushrooms(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public int cost(){
        return this.pizza.cost()+30;
    }
}

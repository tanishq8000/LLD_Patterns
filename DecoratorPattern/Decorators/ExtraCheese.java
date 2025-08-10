package DecoratorPattern.Decorators;

import DecoratorPattern.BasePizzas.Pizza;

public class ExtraCheese extends ToppingDecorator{
    Pizza pizza;
    public ExtraCheese(Pizza pizza){
        this.pizza = pizza;
    }
    @Override
    public int cost(){
        return this.pizza.cost() + 20;
    }
}

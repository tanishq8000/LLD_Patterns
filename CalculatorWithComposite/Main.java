package CalculatorWithComposite;

public class Main {
    public static void main(String[] args) {
        AirthmeticExpression two = new Number(2);

        AirthmeticExpression one = new Number(1);
        AirthmeticExpression seven = new Number(7);

        AirthmeticExpression addExpression = new Expression(one,seven, Operations.ADD);

        AirthmeticExpression parentExpression = new Expression(two,addExpression, Operations.MULTIPLY);

        System.out.println(parentExpression.evaluate());

    }
}

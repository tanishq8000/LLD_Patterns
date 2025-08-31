package CalculatorWithComposite;

public class Number implements AirthmeticExpression{
    int value;
    public Number(int value){
        this.value = value;
    }

    public int evaluate(){
        System.out.println("Number value is : "+value);
        return value;
    }
}

package CalculatorWithComposite;

public class Expression implements AirthmeticExpression{
    AirthmeticExpression leftExpression;
    AirthmeticExpression rightExpression;
    Operations operation;

    public Expression(AirthmeticExpression leftPart,AirthmeticExpression rightPart,Operations operation){
        this.leftExpression = leftPart;
        this.rightExpression = rightPart;
        this.operation = operation;
    }

    public int evaluate(){
        int value = 0;
        switch (operation){
            case ADD:
                value = leftExpression.evaluate() + rightExpression.evaluate();
                break;
            case SUBTRACT:
                value = leftExpression.evaluate() - leftExpression.evaluate();
                break;
            case MULTIPLY:
                value = leftExpression.evaluate() * rightExpression.evaluate();
                break;
            case DIVIDE:
                value = leftExpression.evaluate() / rightExpression.evaluate();
                break;
        }
        System.out.println("Expression value is : " + value);
        return value;
    }
}

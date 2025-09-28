package Interpreter_Design_Pattern;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.put("a",4);
        context.put("b",5);

        // Evaluating a*b using Interpret Pattern
        AbstractExpression expression1 = new MultiplyNonTerminalExpression(new NumberTerminalExpression("a"),new NumberTerminalExpression("b"));
        System.out.println(expression1.interpret(context));
    }
}

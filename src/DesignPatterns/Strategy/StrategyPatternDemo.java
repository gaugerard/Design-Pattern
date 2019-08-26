package DesignPatterns.Strategy;

// Use the context to see change in behaviour when it changes its DesignPatterns.Strategy.

public class StrategyPatternDemo {

    public  static  void main(String[] args){

        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSub());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMul());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}

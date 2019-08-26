package DesignPatterns.decorator_1;

// It will have access to all the same method as PlainPizza has access to.
abstract class ToppingDecorator implements Pizza {

    //Will hold the reference to PlainPizza
    protected Pizza tempPizza;

    public ToppingDecorator(Pizza newPizza){

        // Start adding changes to getDescription() et getCost()
        tempPizza = newPizza;

    }

    public String getDescription(){
        return tempPizza.getDescription();
    }

    public double getCost(){
        return tempPizza.getCost();
    }

    // ==> Now the decorator has access to 2 methods of PlainPizza.


}

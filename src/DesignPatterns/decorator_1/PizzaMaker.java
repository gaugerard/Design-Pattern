package DesignPatterns.decorator_1;

public class PizzaMaker {
    public static void main(String[] args) {

        //Pizza basicPizza = new TomatoSauce(new Mozzarella(new PlainPizza()));
        Pizza basicPizza = new TomatoSauce(new TomatoSauce(new Mozzarella(new PlainPizza())));

        System.out.println("Ingredients : "+basicPizza.getDescription());
        System.out.println("Price : "+basicPizza.getCost());

    }
}

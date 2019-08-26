package DesignPatterns.Visitor_1;

public class Liquor implements Visitable{

    private double price;

    Liquor(double item){
        price = item;
    }

    public double getPrice(){
        return price;
    }

    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}

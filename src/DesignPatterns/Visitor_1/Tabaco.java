package DesignPatterns.Visitor_1;

public class Tabaco implements Visitable {
    private double price;

    Tabaco(double item){
        price = item;
    }

    public double getPrice(){
        return price;
    }


    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}

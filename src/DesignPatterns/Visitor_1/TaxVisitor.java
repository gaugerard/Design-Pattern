package DesignPatterns.Visitor_1;

import java.text.DecimalFormat;

public class TaxVisitor implements Visitor {

    DecimalFormat df = new DecimalFormat("#.##");

    public TaxVisitor(){}

    @Override
    public double visit(Liquor liquorItem) {
        System.out.println("Liquor item : Price with tax");
        return (liquorItem.getPrice() * .18) + liquorItem.getPrice();
    }

    @Override
    public double visit(Tabaco tabacoItem) {
        System.out.println("tabaco item : Price with tax");
        return (tabacoItem.getPrice() * .32) + tabacoItem.getPrice();
    }

    @Override
    public double visit(Neccessity necessityItem) {
        System.out.println("Neccessity item : Price with tax");
        return (necessityItem.getPrice() * 0.0) + necessityItem.getPrice();
    }
}

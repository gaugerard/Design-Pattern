package DesignPatterns.Visitor_1;

import java.text.DecimalFormat;

public class TaxHolidayVisitor implements Visitor {
    DecimalFormat df = new DecimalFormat("#.##");

    public TaxHolidayVisitor(){}

    @Override
    public double visit(Liquor liquorItem) {
        System.out.println("Liquor item : Price with holiday tax");
        return (liquorItem.getPrice() * .9) + liquorItem.getPrice();
    }

    @Override
    public double visit(Tabaco tabacoItem) {
        System.out.println("Liquor item : Price with holiday tax");
        return (tabacoItem.getPrice() * .16) + tabacoItem.getPrice();
    }

    @Override
    public double visit(Neccessity necessityItem) {
        System.out.println("Liquor item : Price with holiday tax");
        return (necessityItem.getPrice() * 0) + necessityItem.getPrice();
    }
}

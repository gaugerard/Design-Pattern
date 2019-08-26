package DesignPatterns.Visitor_1;

public class Main {

    public static void main(String[] args){
        TaxVisitor classicTax = new TaxVisitor();
        TaxHolidayVisitor holidayTax = new TaxHolidayVisitor();

        Neccessity milk = new Neccessity(3.47);
        Liquor vodka = new Liquor(8.99);
        Neccessity bread = new Neccessity(2.5);
        Liquor beer = new Liquor(3.8);
        Liquor ricard = new Liquor(7.5);
        Tabaco cigarette = new Tabaco(5.0);

        System.out.println(milk.accept(classicTax) + "\n");
        System.out.println(vodka.accept(classicTax) + "\n");
        System.out.println(bread.accept(classicTax) + "\n");
        System.out.println(beer.accept(classicTax) + "\n");
        System.out.println(ricard.accept(classicTax) + "\n");
        System.out.println(cigarette.accept(classicTax) + "\n");

        System.out.println("TAX HOLIDAY PRICES\n");

        System.out.println(milk.accept(holidayTax) + "\n");
        System.out.println(vodka.accept(holidayTax) + "\n");
        System.out.println(bread.accept(holidayTax) + "\n");
        System.out.println(beer.accept(holidayTax) + "\n");
        System.out.println(ricard.accept(holidayTax) + "\n");
        System.out.println(cigarette.accept(holidayTax) + "\n");


    }
}

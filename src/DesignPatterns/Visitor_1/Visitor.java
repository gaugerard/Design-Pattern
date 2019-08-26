package DesignPatterns.Visitor_1;

interface Visitor {

    public double visit(Liquor liquorItem);
    public double visit(Tabaco tabacoItem);
    public double visit(Neccessity necessityItem);

}

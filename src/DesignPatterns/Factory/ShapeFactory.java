package DesignPatterns.Factory;

public class ShapeFactory {

    public Shape getShape(String shapetype){

        if(shapetype == null){
            return null;
        }

        if(shapetype.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }

        else if(shapetype.equalsIgnoreCase("SQUARE")){
            return new Square();
        }

        return null;
    }
}

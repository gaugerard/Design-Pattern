package DesignPatterns.AbstractFactory;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args){

        // We choose the factory we want (here : the not rounded factory).
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);

        Shape shape1 = shapeFactory.getShape("RECTANGLE");
        shape1.draw();

        AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);

        Shape shape2 = shapeFactory1.getShape("RECTANGLE");
        shape2.draw();
    }
}

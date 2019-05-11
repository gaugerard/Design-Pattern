package Prototype;

public class ProtoypePatternDemo {
    public static void main(String[] args){
        ShapeCache.loadCache();

        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println("SHAPE : " + clonedShape.getType());

        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("SHAPE : " + clonedShape2.getType());
    }
}

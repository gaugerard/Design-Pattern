package DesignPatterns.Bridge;

//Create concrete bridge implementer classes implementing the drawAPI interface.
public class GreenCircle implements DrawAPI{

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: " + radius + ", x: " + x + ", y: " + y + "]");
    }
}

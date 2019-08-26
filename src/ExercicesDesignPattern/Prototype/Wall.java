package ExercicesDesignPattern.Prototype;

public class Wall implements Cloneable {

    private String orientation = "North";
    private boolean hasDoor = false;
    private double height = 2.0;

    public void changeOrientation(String orientation){
        this.orientation = orientation;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public void installDoor(){
        this.hasDoor = true;
    }

    public void removeDoor(){
        this.hasDoor = false;
    }

    public Wall cloneit() {
        final Wall copy = new Wall();
        copy.orientation = orientation;
        copy.hasDoor = hasDoor;
        copy.height = height;
        return copy;
    }

    @Override
    public String toString(){
        return String.format("\nWall [orientation=%s, hasDoor=%s, height=%s]", orientation, hasDoor, height);
    }

}

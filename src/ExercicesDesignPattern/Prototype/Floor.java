package ExercicesDesignPattern.Prototype;

import java.util.ArrayList;


public class Floor implements Cloneable {

    private int level;
    private ArrayList<Wall> walls = new ArrayList<Wall>();

    public Floor(){
        final Wall w1 = new Wall();
        final Wall w2 = (Wall) w1.cloneit();
        w2.changeOrientation("East");
        final Wall w3 = (Wall) w1.cloneit();
        w3.changeOrientation("South");
        final Wall w4 = (Wall) w1.cloneit();
        w4.changeOrientation("West");
        w4.installDoor();
        walls.add(w1);
        walls.add(w2);
        walls.add(w3);
        walls.add(w4);

    }

    public void setLevel(int level){
        this.level = level;
    }

    public void changeWallHeight(double height){
        for (Wall wall : walls) {
            wall.setHeight(height);
        }

    }

    public Floor cloneit() {
        final Floor copy = new Floor();
        copy.walls = walls;
        return copy;
    }

    @Override
    public String toString(){
        StringBuilder information = new StringBuilder();
        for (Wall wall : walls) {
            information.append(wall.toString());
        }
        return "Floor number " + Integer.toString(this.level) + " : " + information;
    }


}

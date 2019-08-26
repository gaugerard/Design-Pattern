package ExercicesDesignPattern.Prototype;

import java.util.ArrayList;
import java.util.Random;

public class House implements Cloneable{
    private int houseId;
    private ArrayList<Floor> floors = new ArrayList<Floor>();

    public House(int houseId){

        this.houseId = houseId;

        Random rand = new Random();
        int n = rand.nextInt(5); // to get a unique ID.

        final Floor f1 = new Floor();
        f1.setLevel(0);
        floors.add(f1);

        for(int e=1; e<n; e++){
            Floor fx = (Floor) f1.cloneit();
            fx.setLevel(e);
            floors.add(fx);
        }
    }

    public House cloneit(int id) {
        final House copy = new House(id);
        copy.floors = floors;
        return copy;
    }

    @Override
    public String toString(){
        StringBuilder information = new StringBuilder();
        for (Floor floor : floors) {

            information.append("\n" + floor.toString());
        }
        return "House has number " + Integer.toString(this.houseId) + " : "+ information;
    }
}

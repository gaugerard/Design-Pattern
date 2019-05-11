package Singleton;

import java.util.Random;

public class TwoSingletonObject {
    private String id;

    static private TwoSingletonObject first_instance = null;
    static private TwoSingletonObject second_instance = null;

    private TwoSingletonObject(String identifiant){
        this.id = identifiant;
    }

    static public TwoSingletonObject getInstance(){
        if (first_instance == null && second_instance == null){
            String identifiant = "firstObject"; // to get a unique ID.
            first_instance = new TwoSingletonObject(identifiant);
            identifiant = "secondObject"; // to get a unique ID.
            second_instance = new TwoSingletonObject(identifiant);
        }

        Random rand = new Random();
        int n = rand.nextInt(2);
        if(n == 0){
            return first_instance;
        }
        else {
            return second_instance;
        }
    }

    public void showInfo(){
        System.out.println(this.id);
    }
}

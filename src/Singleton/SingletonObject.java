package Singleton;
import java.util.Random;

public class SingletonObject {

    private int id;

    static private SingletonObject instance = null;

    private SingletonObject(int identifiant){
        this.id = identifiant;
    }

    static public SingletonObject getInstance(){
        if (instance == null){
            Random rand = new Random();
            int n = rand.nextInt(50); // to get a unique ID.
            instance = new SingletonObject(n);
        }
        return instance;
    }

    public void showInfo(){
        System.out.println(instance.id);
    }
}

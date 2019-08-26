package ExercicesDesignPattern.Singleton;

import java.util.Random;

public class ThreadSafeSingleton {
    // Static makes it accessible by the class.
    static private volatile ThreadSafeSingleton instance = null;
    static private int id;

    private ThreadSafeSingleton(int identifiant) {id = identifiant; }

    // using synchronized makes sure that only one thread at a time can execute getInstance().
    static public synchronized ThreadSafeSingleton getThreadSafeSingleton()
    {
        if (instance == null)
        {
            // To make thread safe.
            synchronized (ThreadSafeSingleton.class)
            {
                Random rand = new Random();
                int n = rand.nextInt(50); // to get a unique ID.
                instance = new ThreadSafeSingleton(n);
            }
        }
        System.out.println(id);
        return instance;
    }
}



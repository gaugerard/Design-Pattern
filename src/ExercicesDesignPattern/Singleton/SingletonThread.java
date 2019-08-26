package ExercicesDesignPattern.Singleton;

import DesignPatterns.Singleton.SingletonObject;

// Creating multiple Threads.
public class SingletonThread{

    public static void main(String[] args)
    {

        for(int i=0; i<10; i++){
            new Thread(" " + i)
            {
                public void run()
                {
                    System.out.println(getName() + " : I call the singleton !");
                    //Good tread implementation.
                    ThreadSafeSingleton.getThreadSafeSingleton();

                    //Bad thread implementation.
                    //SingletonObject.getInstance().showInfo();
                    System.out.println("-----");
                }
            }.start();
        }
    }
}

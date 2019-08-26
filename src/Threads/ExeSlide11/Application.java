package Threads.ExeSlide11;

public class Application {
    static Account gauthier;

    public static void main(String[] args){
        gauthier = new Account();

        Thread t1= new Thread(new Job(gauthier,600));
        Thread t2= new Thread(new Job(gauthier,800));
        t1.start();
        t2.start();
    }
}

package DesignPatterns.Configuration;

public class Application {

    public static void main(String args[]){
        final MyConfig config = new MyConfig();

        try{
            config.setA(new A()); // we give an object of type A
            config.setB(new B()); // we give an object of type B
            config.setC(new C()); // we give an object of type C
            config.configure(); // we launch the configuration
        } catch (final BadPreCondition e){
            e.printStackTrace();
        }

    }
}

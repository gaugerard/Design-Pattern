package Singleton;

public class TwoSingletonPatternDemo {

    public static void main(String[] args){

        //cannot do this since the constructor is PRIVATE
        //SingletonObject object = new SingletonObject();

        TwoSingletonObject.getInstance().showInfo();
        TwoSingletonObject.getInstance().showInfo();
        TwoSingletonObject.getInstance().showInfo();
    }
}

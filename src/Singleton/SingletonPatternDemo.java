package Singleton;

public class SingletonPatternDemo {

    public static void main(String[] args){

        //cannot do this since the constructor is PRIVATE
        //SingletonObject object = new SingletonObject();

        SingletonObject.getInstance().showInfo();
        SingletonObject.getInstance().showInfo();
        SingletonObject.getInstance().showInfo();
    }
}

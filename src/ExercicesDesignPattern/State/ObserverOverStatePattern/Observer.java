package ExercicesDesignPattern.State.ObserverOverStatePattern;


public abstract class Observer {
    protected TCPConnection subject;
    public abstract void update();
}

package ExercicesDesignPattern.State.ObserverOverStatePattern;

public class ClientObserver extends Observer {

    //The subject is the TCPConnection.
    public ClientObserver(TCPConnection subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("ClientObserver : "+ ( subject.getState().toString()));
    }
}

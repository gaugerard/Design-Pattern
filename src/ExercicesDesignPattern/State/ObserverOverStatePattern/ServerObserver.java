package ExercicesDesignPattern.State.ObserverOverStatePattern;

public class ServerObserver extends Observer{

    public ServerObserver(TCPConnection subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("ServerObserver : "+ ( subject.getState().toString()));
    }
}

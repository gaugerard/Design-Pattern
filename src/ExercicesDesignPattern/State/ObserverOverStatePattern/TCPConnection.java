package ExercicesDesignPattern.State.ObserverOverStatePattern;

import java.util.ArrayList;
import java.util.List;

public class TCPConnection {

    private List<Observer> observers = new ArrayList<Observer>();

    TCPState tcpListen;
    TCPState tcpClosed;

    TCPState tcpState;

    public TCPConnection(){
        tcpListen = new TCPListen(this);
        tcpClosed = new TCPClosed(this);

        tcpState = tcpClosed;
    }

    public TCPState getState(){
        return tcpState;
    }

    public void setTCPState(TCPState newTCPState){
        tcpState = newTCPState;
        notifyAllObservers();
    }

    public void Open(){
        tcpState.Open();
    }

    public void Close(){
        tcpState.Close();
    }

    public void Acknowledge(){
        tcpState.Acknowledge();
    }

    public TCPState getTCPListen() { return tcpListen; }
    public TCPState getTCPClosed() { return tcpClosed; }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }

}
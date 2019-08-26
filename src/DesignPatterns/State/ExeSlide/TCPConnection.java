package DesignPatterns.State.ExeSlide;

public class TCPConnection {

    TCPState tcpListen;
    TCPState tcpClosed;

    TCPState tcpState;

    public TCPConnection(){
        tcpListen = new TCPListen(this);
        tcpClosed = new TCPClosed(this);

        tcpState = tcpClosed;
    }

    public void setTCPState(TCPState newTCPState){
        tcpState = newTCPState;
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

}
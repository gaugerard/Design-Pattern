package DesignPatterns.State.ExeSlide;

public class TCPListen implements TCPState  {

    TCPConnection tcpConnection;

    public TCPListen(TCPConnection newTcpConnection){
        tcpConnection = newTcpConnection;
    }

    public void Open(){
        System.out.println("TCPListen TCP connection already open.");
    }

    public void Close(){
        System.out.println("TCPListen TCP connection closing.");
        tcpConnection.setTCPState(tcpConnection.getTCPClosed());
    }

    public void Acknowledge(){
        System.out.println("TCPListen TCP ACK sent.");
    }
}

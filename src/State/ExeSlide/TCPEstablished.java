package State.ExeSlide;

public class TCPEstablished implements TCPState  {

    TCPConnection tcpConnection;

    public TCPEstablished(TCPConnection newTcpConnection){
        tcpConnection = newTcpConnection;
    }

    public void Open(){
        System.out.println("TCPEstablished TCP connection already open.");
    }

    public void Close(){
        System.out.println("TCPEstablished TCP connection closing.");

    }

    public void Acknowledge(){
        System.out.println("TCPEstablished TCP ACK sent.");
    }
}

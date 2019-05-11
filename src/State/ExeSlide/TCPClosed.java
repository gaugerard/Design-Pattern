package State.ExeSlide;

public class TCPClosed implements TCPState {

    TCPConnection tcpConnection;

    public TCPClosed(TCPConnection newTcpConnection){
        tcpConnection = newTcpConnection;
    }

    public void Open(){
        System.out.println("TCPClosed TCP opening.");
        tcpConnection.setTCPState(tcpConnection.getTCPListen());
    }

    public void Close(){
        System.out.println("TCPClosed TCP already closed.");
    }

    public void Acknowledge(){
        System.out.println("TCPClosed so can't ACK.");
    }
}

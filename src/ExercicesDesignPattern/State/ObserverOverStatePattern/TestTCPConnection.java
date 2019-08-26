package ExercicesDesignPattern.State.ObserverOverStatePattern;

public class TestTCPConnection {

    public static void main(String[] args){
        // is the Subject
        TCPConnection tcpConnection = new TCPConnection();

        new ServerObserver(tcpConnection);
        new ClientObserver(tcpConnection);

        tcpConnection.Open();

        tcpConnection.Close();

        tcpConnection.Close();

        tcpConnection.Acknowledge();

        tcpConnection.Open();

        tcpConnection.Acknowledge();

        tcpConnection.Close();
    }
}

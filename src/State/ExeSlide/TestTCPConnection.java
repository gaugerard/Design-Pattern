package State.ExeSlide;

public class TestTCPConnection {

    public static void main(String[] args){
        TCPConnection tcpConnection = new TCPConnection();

        tcpConnection.Open();

        tcpConnection.Close();

        tcpConnection.Close();

        tcpConnection.Acknowledge();

        tcpConnection.Open();

        tcpConnection.Acknowledge();

        tcpConnection.Close();
    }
}

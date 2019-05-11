package Proxy_1;

public class ProxyPatternDemo {

    public static void main(String args[]){
        Image image = new ProxyImage("Test_10mb.jpg");

        image.display();
        System.out.println("");

        image.display();
    }
}

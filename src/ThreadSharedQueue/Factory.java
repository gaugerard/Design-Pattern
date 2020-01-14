package ThreadSharedQueue;

import java.util.LinkedList;
import java.util.Queue;

public class Factory
{
    private static Queue<String> sharedQueue = new LinkedList<>();

    public static void main(String[] args)
    {
        System.out.println("factory started ");

        Producer producer = new Producer(sharedQueue);
        producer.start();

        Consumer consumer = new Consumer(sharedQueue);
        consumer.start();

        try {
            System.out.println("main thread wait until the consumer completes ");
            synchronized (consumer) {
                consumer.wait();
            }
        } catch (InterruptedException e) {
            System.out.println("sleeping thread get interrupted ");
        }
        System.out.println("main thread completed  ");
    }
}
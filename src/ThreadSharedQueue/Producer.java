package ThreadSharedQueue;

import java.util.Queue;

class Producer extends Thread
{
    private Integer numOfItemsToBeProduced = 10;
    private int maxQueueSize = 5;
    private Queue<String> sharedQueue;

    Producer(Queue<String> sharedQueue)
    {
        this.sharedQueue = sharedQueue;
    }


    public void run()
    {
        synchronized (sharedQueue) {
            while (sharedQueue.size() <= maxQueueSize && numOfItemsToBeProduced != 0)
            {
                String item = "item " + numOfItemsToBeProduced;
                System.out.println("producing " + item);
                sharedQueue.add(item);
                numOfItemsToBeProduced--;

                if (sharedQueue.size() == maxQueueSize) {
                    System.out.println("queue is full. notifying the consumer ");
                    try {
                        Thread.sleep(2000);
                        sharedQueue.notify();
                        sharedQueue.wait();
                    } catch (InterruptedException e) {
                        System.out.println("sleeping thread get interrupted ");
                    }
                }
            }
            sharedQueue.notifyAll();
            System.out.println("Producer Completed (Nothing to be produced) : remaining items ["+numOfItemsToBeProduced+"]");
        }

        synchronized (this) {
            //notify all the threads that are waited on the Producer
            notifyAll();
        }
    }
}
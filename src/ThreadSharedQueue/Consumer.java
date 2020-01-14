package ThreadSharedQueue;

import java.util.Queue;

class Consumer extends Thread
{
    private Integer numOfItemsToBeConsumed = 10;
    private Queue<String> sharedQueue;

    Consumer(Queue<String> sharedQueue)
    {
        this.sharedQueue = sharedQueue;
    }

    public void run()
    {
        System.out.println("consumer started ");
        synchronized (sharedQueue) {
            while (!sharedQueue.isEmpty() && numOfItemsToBeConsumed != 0) {
                System.out.println("consuming " + sharedQueue.poll());
                numOfItemsToBeConsumed--;

                if (sharedQueue.isEmpty()) {
                    try {
                        System.out.println("consumer waits till producer produces items ");
                        Thread.sleep(2000);
                        sharedQueue.notify();
                        sharedQueue.wait();
                    } catch (InterruptedException e) {
                        System.out.println("Consumer: waiting thread interrupted ");
                    }
                }
            }
            //notifying all the threads that are waiting on the shared queue
            sharedQueue.notifyAll();
            System.out.println("Consumer Completed (Nothing to be consumed) : remaining items ["+numOfItemsToBeConsumed+"]");
        }

        synchronized (this) {
            //notify all the threads that are waited on the Consumer
            notifyAll();
        }
    }
}
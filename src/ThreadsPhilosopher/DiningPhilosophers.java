package ThreadsPhilosopher;

import java.util.Arrays;

public class DiningPhilosophers {

    public static void main(String[] args) throws Exception{

        Philosopher[] philosophers = new Philosopher[2];
        Object[] forks = new Object[philosophers.length];

        Arrays.fill(forks, new Object());

        for (int i = 0; i < philosophers.length; i++){

            Object leftFork = forks[i];
            Object rightFork = forks[(i + 1) % forks.length];

            // comment the following to see a deadlock occurring
            if (i == philosophers.length - 1) {
                philosophers[i] = new Philosopher(rightFork, leftFork); // The last philosopher picks up the right fork first
            } else {
                philosophers[i] = new Philosopher(leftFork, rightFork);
            }

            Thread t = new Thread(philosophers[i], "Philosopher " + (i + 1));
            t.start();

        }
    }
}

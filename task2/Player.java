package Threads;

import static java.lang.Thread.sleep;

public class Player implements Runnable {
    private int N = 10;
    private int queue;

    public Player() {
        queue = 0;
    }

    public synchronized void turn() throws InterruptedException {
        if (queue == 0) {
            queue = 1;
            System.out.println("Ping 1");
        }
        else if (queue == 1) {
            queue = 2;
            System.out.println("Pong 2");
        }
        else if (queue == 2) {
            queue = 3;
            System.out.println("Ping 3");
        }
        else if (queue == 3) {
            queue = 0;
            System.out.println("Pong 4");
        };
        sleep(100);
    }

    @Override
    public void run() {
        try {
            for(int i = 0; i < N; ++i)
                turn();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

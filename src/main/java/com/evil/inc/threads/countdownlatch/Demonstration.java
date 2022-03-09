package com.evil.inc.threads.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class Demonstration {

    public static void main(String[] args) throws InterruptedException {

        //Created CountDownLatch for 2 threads
        CountDownLatch countDownLatch = new CountDownLatch(2);

        //Created and started two threads
        Worker A = new Worker(countDownLatch, "A");

        Worker B = new Worker(countDownLatch, "B");

        A.start();
        B.start();

        //When two threads(A and B)complete their tasks, they are returned (counter reached 0).
        countDownLatch.await();

        //Now execution of master thread has started
        Master D = new Master("");

        D.start();

    }

}

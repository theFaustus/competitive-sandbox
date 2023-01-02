package com.evil.inc.threads.dinningphilosophers;

import java.util.concurrent.locks.ReentrantLock;

public class Chopstick {
    private ReentrantLock lock = new ReentrantLock();

    public boolean pickUp(){
        return lock.tryLock();
    }

    public void putDown(){
        lock.unlock();
    }
}

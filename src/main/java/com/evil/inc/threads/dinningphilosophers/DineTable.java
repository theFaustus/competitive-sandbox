package com.evil.inc.threads.dinningphilosophers;

public class DineTable {
    public static void main(String[] args) {

        Chopstick chopstick1 = new Chopstick();
        Chopstick chopstick2 = new Chopstick();
        Chopstick chopstick3 = new Chopstick();
        Chopstick chopstick4 = new Chopstick();
        Chopstick chopstick5 = new Chopstick();
        Chopstick chopstick6 = new Chopstick();

        Philosopher philosopher1 = new Philosopher("Philosopher-1", chopstick1, chopstick2);
        Philosopher philosopher2 = new Philosopher("Philosopher-2", chopstick2, chopstick3);
        Philosopher philosopher3 = new Philosopher("Philosopher-3", chopstick3, chopstick4);
        Philosopher philosopher4 = new Philosopher("Philosopher-4", chopstick4, chopstick5);
        Philosopher philosopher5 = new Philosopher("Philosopher-5", chopstick5, chopstick6);
        Philosopher philosopher6 = new Philosopher("Philosopher-6", chopstick6, chopstick1);

        philosopher1.start();
        philosopher2.start();
        philosopher3.start();
        philosopher4.start();
        philosopher5.start();
        philosopher6.start();

    }
}

package com.evil.inc.threads.dinningphilosophers;

public class Philosopher extends Thread{
    private Chopstick left, right;
    private String name;
    private int numberOfBites = 10;

    public Philosopher(String name, Chopstick left, Chopstick right) {
        this.name = name;
        this.left = left;
        this.right = right;
    }

    @Override
    public void run() {
        for (int i = 0; i < numberOfBites; i++) {
            eat();
        }
    }

    public boolean pickUpChopsticks(){
        if (!left.pickUp()){
            System.out.println(name + " could not pickup left chopstick ");
            return false;
        }
        if (!right.pickUp()){
            System.out.println(name + " could not pickup right chopstick, putting left down ");
            left.putDown();
            return false;
        }
        System.out.println(name + " ready to eat ");
        return true;
    }

    public void putDownChopsticks(){
        right.putDown();
        left.putDown();
    }

    public void chew(){
        System.out.println(name + " chewing...");
    }

    public void eat(){
        if (pickUpChopsticks()){
            chew();
            putDownChopsticks();
        }
    }

    public void eatSlow(){
        if (pickUpChopsticks()){
            try {
                System.out.println(name + " something in my mouth!");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            chew();
            putDownChopsticks();
        }
    }
}

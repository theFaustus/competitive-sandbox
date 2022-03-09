package com.evil.inc.threads;

class RunnableDemonstration {
    public static void main( String args[] ) {
        Thread t = new Thread(() -> System.out.println("Say Hello"));
        t.start();
    }


}

package com.evil.inc.threads;

class SubclassDemonstration {
    public static void main( String args[] ) throws Exception {
        ExecuteMe executeMe = new ExecuteMe();
        executeMe.start();
        executeMe.join();
      
    }
}

class ExecuteMe extends Thread {
  
  @Override
  public void run() {
    System.out.println("I ran after extending Thread class");
  }
  
}

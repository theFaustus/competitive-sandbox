package com.evil.inc.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableDemonstration {
    
    // Create and initialize a threadpool
    static ExecutorService threadPool = Executors.newFixedThreadPool(2);
  
    public static void main( String args[] ) throws Exception {
        System.out.println( "sum :" + findSum(10));
        threadPool.shutdown();
    }
  
    static int findSum(final int n) throws ExecutionException, InterruptedException {

        Callable<Integer> sumTask = () -> {
            int sum = 0;
            for (int i = 1; i <= n; i++)
                sum += i;
            return sum;
        };

        Future<Integer> f = threadPool.submit(sumTask);
        return f.get();
    }  
  
  
}

package com.thread.com.exercise.pow;

/**
 * Created by joschinc on 11/15/16.
 */
public class Pow2Threads {

   private static double result = 0;
    private static Object lock = new Object();

    public static int pow(int number) {
        return (int) Math.pow(number, 2);
    }

    public static int sumPow(int[] n) {
        int sum = 0;
        for (int i = 0; i < n.length; i++) {
            sum += n[i];
        }
        return sum;
    }

    public static void main(String[] args){
        final int n = 5;
        final int[] arr = new int[n];

        Thread t1 = new Thread(new Runnable() {
            // Not necessary this first thread, just for test;
            @Override
            public void run() {
                synchronized (lock) {
                    for (int i = 0; i < n; i++) {
                        arr[i] = pow(i+1);
                    }
                    lock.notify();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock) {

                        result = sumPow(arr);

                }
            }
        });

        try {

            t1.start();
            t2.start();
            t1.join();

            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Value: " + result);
    }
}
// synchronized - wait notify and notifyAll
// join - sleep
// yield
// priority 1 - 10
//life cycle of thread - start - runnable- running - halt/wait -
// best way to stop a thread. - we shouldn't be using the stop method .. Interrupt
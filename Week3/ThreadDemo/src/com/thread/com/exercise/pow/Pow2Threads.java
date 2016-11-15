package com.thread.com.exercise.pow;

/**
 * Created by joschinc on 11/15/16.
 */
public class Pow2Threads {

    private static double sum = 0;

    public static synchronized double pow(int number) {
        return Math.pow(number, 2);
    }

    public static synchronized void sumPow(int n) {
        for (int i = 1; i <= n; i++) {
            sum += pow(i);
        }
    }

    public static void main(String[] args){
        Thread t1 = new Thread(new Runnable() {
            // Not necessary this first thread, just for test;
            @Override
            public void run() {
                pow(2);
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                sumPow(5);
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Value: " + sum);
    }
}

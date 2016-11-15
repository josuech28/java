package com.thread.com.exercise.pow;

/**
 * Created by joschinc on 11/15/16.
 */
public class Pow implements Runnable {
    private static double sum = 0;

    public static synchronized double pow(int number) {
        return Math.pow(number, 2);
    }

    public static synchronized void sumPow(int n) {
        for (int i = 1; i <= n; i++) {
            sum += pow(i);
        }
    }

    @Override
    public void run() {
        sumPow(5);
    }


    public static void main(String[] args) {
        Thread t1 = new Thread(new Pow());
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(sum);
    }
}


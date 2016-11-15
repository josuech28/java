package com.thread.com.thread.runnable;

/**
 * Created by joschinc on 11/14/16.
 */
public class MyThreadRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            System.out.println(Thread.currentThread().getId()+" Value: " + i);
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

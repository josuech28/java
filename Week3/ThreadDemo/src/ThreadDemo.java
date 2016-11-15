import com.thread.MyThread;
import com.thread.com.thread.runnable.MyThreadRunnable;

/**
 * Created by joschinc on 11/14/16.
 */
public class ThreadDemo {
    public static void main(String[] args){
        // First option
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        //thread1.start();
        //thread2.start();

        //Second Option
        Thread t1 = new Thread(new MyThreadRunnable());
        Thread t2 = new Thread(new MyThreadRunnable());

        // Always call start method
        //t2.start();
        //t1.start();

        // 3 Option
        Thread t3 = new Thread(new Runnable() {
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
        });
        t3.start();

    }
}

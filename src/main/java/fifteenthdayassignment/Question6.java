package fifteenthdayassignment;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class MyThread extends Thread {
    private static final Logger log= LogManager.getLogger(MyThread.class);
    @Override
    public void run(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        log.info(String.format("%s %s",Thread.currentThread().getName()," is running"));
    }

}

public class Question6 {
    public static void main(String[] args) {
        MyThread myThread1=new MyThread();
        MyThread myThread2=new MyThread();
        MyThread myThread3=new MyThread();
        myThread1.start();
        try {
            myThread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        myThread2.start();
        try {
            myThread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        myThread3.start();
        try {
            myThread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
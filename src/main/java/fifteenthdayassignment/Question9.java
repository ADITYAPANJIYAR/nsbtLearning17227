package fifteenthdayassignment;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class DeadLock extends Thread {
    private static final Logger log= LogManager.getLogger(DeadLock.class);
    public synchronized void hello() {
        for (int i = 0; i < 10; i++) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            log.info("hello");
            notifyAll();
        }
    }
    public synchronized void bye() {
        for (int i = 0; i < 10; i++) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            log.info("bye");
            notifyAll();
    }
    @Override
    public void run(){
        //
    }
}

public class Question9 {
    public static void main(String[] args) {
        DeadLock deadLock=new DeadLock();
        Thread t1=new Thread(deadLock::hello);
        Thread t2=new Thread(deadLock::bye);
        t1.start();
        t2.start();
    }
}
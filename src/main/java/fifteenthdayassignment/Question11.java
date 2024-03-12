package fifteenthdayassignment;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class Drive {
    private final static Logger log=LogManager.getLogger(Question11.class);
    public synchronized void testDrive(){
        log.info(Thread.currentThread().getName()+" Driving");
    }
}

public class Question11{
    public static void main(String[] args) {
        Drive drive=new Drive();
        Thread thread1=new Thread(drive::testDrive);
        Thread thread2=new Thread(drive::testDrive);
        Thread thread3=new Thread(drive::testDrive);

        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread2.start();
        try {
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread3.start();
        try {
            thread3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
package fifteenthdayassignment;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HelloThread extends Thread{
    private static final Logger log= LogManager.getLogger(HelloThread.class);
    Thread thread=new Thread();
    @Override
    public void run(){
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        log.info("Hello world");
    }
}

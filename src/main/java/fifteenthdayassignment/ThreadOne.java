package fifteenthdayassignment;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ThreadOne extends Thread{
    private static final Logger log= LogManager.getLogger(ThreadOne.class);
    @Override
    public void run(){
        log.info("ThreadOne started "+Thread.currentThread().getName());
    }
}

package fifteenthdayassignment;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ByeThread extends Thread{
    private static final Logger log= LogManager.getLogger(ByeThread.class);

    Thread thread=new Thread();
    @Override
    public void run(){
//        try {
//            sleep(2000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        log.info("Bye");
    }
}

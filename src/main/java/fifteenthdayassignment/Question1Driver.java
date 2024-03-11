package fifteenthdayassignment;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Question1Driver {
    private static final Logger log= LogManager.getLogger(Question1Driver.class);
    public static void main(String[] args) {
        ThreadOne threadOne=new ThreadOne();
        Thread thread=new Thread(()-> log.info(Thread.currentThread().getName()));
        threadOne.start();
        thread.start();
    }
}

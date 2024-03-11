package fifteenthdayassignment;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class Question3Thread extends Thread {
    private static final Logger log = LogManager.getLogger(Question3Thread.class);
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            log.info(String.format("%s %d", Thread.currentThread().getName(),i));
        }
    }
}

public class Question3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            Question3Thread question3Thread=new Question3Thread();
            if(i==1){
                question3Thread.setPriority(Thread.MAX_PRIORITY);
            }
            question3Thread.setName("Thread "+i);
            question3Thread.start();
        }

    }
}

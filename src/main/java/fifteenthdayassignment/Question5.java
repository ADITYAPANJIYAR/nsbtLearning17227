package fifteenthdayassignment;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class HelloByeThread extends Thread {
    private static final Logger log= LogManager.getLogger(HelloByeThread.class);
    private static boolean isHelloTurn = true;
    public synchronized void hello() {
        for (int i = 0; i < 10; i++) {
            while (!isHelloTurn) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            log.info("hello");
            isHelloTurn = false;
            notifyAll();
        }
    }
    public synchronized void bye() {
        for (int i = 0; i < 10; i++) {
            while (isHelloTurn) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            log.info("bye");
            isHelloTurn = true;
            notifyAll();
        }
    }
    @Override
    public void run(){
        //
    }
}

public class Question5 {
    public static void main(String[] args) {
        HelloByeThread helloByeThread=new HelloByeThread();
        Thread t1=new Thread(helloByeThread::hello);
        Thread t2=new Thread(helloByeThread::bye);
        t1.start();
        t2.start();
    }
}

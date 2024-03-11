package fifteenthdayassignment;

class HelloByeThread extends Thread {
    private String message;
    private Object lock;

    public HelloByeThread(String message, Object lock) {
        this.message = message;
        this.lock = lock;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            synchronized(lock) {
                System.out.println(message);
                try {
                    lock.notify(); // Notify the other thread
                    if (i < 9) {
                        lock.wait(); // Wait for the other thread to notify
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

public class Question5 {
    public static void main(String[] args) {
        Object lock = new Object();
        HelloByeThread helloThread = new HelloByeThread("Hello", lock);
        HelloByeThread byeThread = new HelloByeThread("Bye", lock);

        helloThread.start();
        byeThread.start();
    }
}
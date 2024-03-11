package fifteenthdayassignment;

class MyThread extends Thread {
    private int id;
    private Thread prevThread;

    public MyThread(int id, Thread prevThread) {
        this.id = id;
        this.prevThread = prevThread;
    }

    public void run() {
        try {
            if (prevThread != null) {
                prevThread.join(); // Wait for the previous thread to complete
            }
            System.out.println("Thread " + id + " is running.");
            Thread.sleep(1000); // Simulating some task in the thread
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Question6 {
    public static void main(String[] args) {
        Thread prevThread = null;
        for (int i = 1; i <= 5; i++) {
            MyThread thread = new MyThread(i, prevThread);
            thread.start();
            prevThread = thread;
        }
    }
}


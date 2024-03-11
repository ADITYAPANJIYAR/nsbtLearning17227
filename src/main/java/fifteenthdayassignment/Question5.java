package fifteenthdayassignment;

class Thread1 extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            synchronized (this) {
                System.out.println("Hello");
                this.notify(); // Notify the other thread
//                try {
//                    this.wait(); // Wait for the other thread to notify
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
            }
        }
    }
}

class Thread2 extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            synchronized (this) {
                System.out.println("Bye");
                this.notify(); // Notify the other thread
//                try {
//                    if (i < 9) {
//                        this.wait(); // Wait for the other thread to notify
//                    }
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
            }
        }
    }
}

public class Question5 {
    public static void main(String[] args) {
        Thread1 thread1=new Thread1();
        Thread2 thread2=new Thread2();
        thread1.start();
        thread2.start();
    }
}



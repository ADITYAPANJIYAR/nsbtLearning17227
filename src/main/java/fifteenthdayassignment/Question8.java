package fifteenthdayassignment;

class IncrementStatic {
    private static int count;
    public static void incrementCounter() {
        count++;
        System.out.println("Count value is"+count);
    }
}

public class Question8 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(() -> {
                System.out.println("Thread " + Thread.currentThread().getName() + " started");
                IncrementStatic.incrementCounter();
            });
            thread.start();
        }
    }
}

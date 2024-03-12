package sixteenthdayassignment;

public class Question2 {
    public static void main(String[] args) {
        int numThreads = 4;
        int range = 10000;
        int numbersPerThread = range / numThreads; // Numbers each thread will process
        DivisorClass[] divisors = new DivisorClass[numThreads];

        // Create threads
        Thread[] threads = new Thread[numThreads];
        for (int i = 0; i < numThreads; i++) {
            divisors[i] = new DivisorClass(); // Initialize the divisor object for each thread
            final int start = i * numbersPerThread + 1;
            final int end = (i + 1) * numbersPerThread;
            final int index = i; // Save the index for use in lambda expression
            threads[i] = new Thread(() -> {
                System.out.println(Thread.currentThread().getName());
                divisors[index].divisorFinder(end);}); // Use the correct index
            threads[i].start();
        }

        // Wait for all threads to finish
        try {
            for (Thread thread : threads) {
                thread.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Find the maximum divisor among all threads
        DivisorClass maxDivisor = new DivisorClass();
        for (DivisorClass divisor : divisors) {
            if (divisor.getMaximum().get() > maxDivisor.getMaximum().get()) {
                maxDivisor = divisor;
            }
        }

        System.out.println(maxDivisor.getMaximumDivisor());
        System.out.println(maxDivisor.getMaximum());
    }
}

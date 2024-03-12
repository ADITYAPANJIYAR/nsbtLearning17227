package fifteenthdayassignment;

import java.util.Arrays;

class SharedResourceThread extends Thread {
    private int[] sharedArray;
    public SharedResourceThread(int[] sharedArray) {
        this.sharedArray = sharedArray;
    }
    public void unSynchronizedMethod(){
        for (int i = 0; i < sharedArray.length; i++) {
            sharedArray[i] = sharedArray[i] + 1;
        }
    }
    public synchronized void synchronizedMethod(){
        for (int i = 0; i < sharedArray.length; i++) {
            sharedArray[i] = sharedArray[i] + 1;
        }
    }

    @Override
    public void run() {
        //
    }
}

public class Question7 {

    public static void print(int[] sharedArray){
        for (int num : sharedArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws InterruptedException {
        int[] sharedArray = new int[15];
        Arrays.fill(sharedArray, 0);
        SharedResourceThread sharedResourceThread = new SharedResourceThread(sharedArray);

        // Without synchronization
        Thread thread1=new Thread(sharedResourceThread::unSynchronizedMethod);
        Thread thread2=new Thread(sharedResourceThread::unSynchronizedMethod);
        System.out.println("Without synchronization:");
        thread1.start();
        Question7.print(sharedArray);
        thread2.start();
        Question7.print(sharedArray);
        Thread.sleep(1000);

        // With synchronization
        Arrays.fill(sharedArray, 0);
        Thread thread3=new Thread(sharedResourceThread::synchronizedMethod);
        Thread thread4=new Thread(sharedResourceThread::synchronizedMethod);
        System.out.println("With synchronization:");
        thread3.start();
        Question7.print(sharedArray);
        thread4.start();
        Question7.print(sharedArray);
    }
}

package fifteenthdayassignment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class DataReaderThread extends Thread {
    private static boolean flag = true;
    private List<String> list1 = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E"));
    private List<String> list2 = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5"));

    public synchronized void printList1() {
        for (String data : list1) {
            try {
                while (!flag) {
                    wait();
                }
                System.out.println(Thread.currentThread().getName() + ": " + data);
                flag = false;
                notifyAll();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void printList2() {
        for (String data : list2) {
            try {
                while (flag) {
                    wait();
                }
                System.out.println(Thread.currentThread().getName() + ": " + data);
                flag = true;
                notifyAll();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Question10 {
    public static void main(String[] args) {
        DataReaderThread dataReaderThread = new DataReaderThread();

        Thread thread1 = new Thread(dataReaderThread::printList1);
        Thread thread2 = new Thread(dataReaderThread::printList2);
        thread1.start();
        thread2.start();
    }
}

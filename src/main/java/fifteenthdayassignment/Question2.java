package fifteenthdayassignment;

public class Question2 {
    public static void main(String[] args) {
        HelloThread helloThread=new HelloThread();
        helloThread.start();
        ByeThread byeThread=new ByeThread();
        byeThread.start();
    }
}

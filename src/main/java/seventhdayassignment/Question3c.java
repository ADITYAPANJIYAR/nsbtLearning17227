package seventhdayassignment;

public class Question3c {
    public static void main(String[] args) {
        methodA(10, 0);
    }

    public static void methodA(int a, int b) {
        // No try-catch block and no throws clause
        int result = a / b; // This will throw an ArithmeticException if b is zero
        System.out.println("Result: " + result);
    }
}

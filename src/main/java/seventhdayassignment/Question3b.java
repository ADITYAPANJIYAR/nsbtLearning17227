package seventhdayassignment;

public class Question3b {
    public static void main(String[] args) {
        methodA(10, 0);
    }

    public static void methodA(int a, int b) {
        try {
            methodB(a, b);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught in methodA: " + e.getMessage());
        }
    }

    public static void methodB(int a, int b) throws ArithmeticException {
        if(b==0)
        throw new ArithmeticException("Attempted to divide by zero");
    }
}


package seventhdayassignment;

public class Question3a {
    public static void main(String[] args) {
        methodA(10,0);
    }
    public static void methodA(int a, int b){
        try {
            int c=a/b;
        }
        catch (ArithmeticException arithmeticException){
            System.out.println(arithmeticException);
        }
    }
}

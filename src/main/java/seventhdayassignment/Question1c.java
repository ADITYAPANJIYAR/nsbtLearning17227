package seventhdayassignment;

public class Question1c {
    public static void main(String[] args) {
        String s=null;
        try {
            System.out.println(s.length());
        }
        finally {
            System.out.println("Finally method");
        }
    }
}

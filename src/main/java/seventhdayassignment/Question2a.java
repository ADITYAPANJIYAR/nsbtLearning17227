package seventhdayassignment;

public class Question2a {
    public static void main(String[] args) throws Exception {
        methodA();
    }
    public static void methodA() {
        try {
            throw new ClassNotFoundException();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

}
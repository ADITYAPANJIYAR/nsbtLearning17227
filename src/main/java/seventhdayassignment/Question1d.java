package seventhdayassignment;

public class Question1d {
    public static void main(String[] args) {
        try {
            methodA();
        } catch (Exception e) {
            System.out.println("Exception caught in main method: " + e.getMessage());
        }
    }
    public static void methodA() throws Exception {
        String s=null;
        System.out.println("entered in method A");
        try{
            System.out.println(s.length());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        methodB();
    }

    public static void methodB() throws Exception {
        System.out.println("entered in method B");
        methodC();
    }

    public static void methodC() throws Exception {
        System.out.println("entered in method C");
        throw new Exception("Exception propagated from methodC");
    }
}


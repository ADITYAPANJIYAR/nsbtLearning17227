package seventhdayassignment;

public class Question2b {
    public static void main(String[] args) {
        methodA();
    }
    public static void methodA(){
        try{
            methodB();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void methodB() throws Exception{
        throw new ClassNotFoundException();
    }
}

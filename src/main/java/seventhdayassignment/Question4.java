package seventhdayassignment;

public class Question4 {
    public static void main(String[] args) {
        foo();
    }
    public static void foo(){
        try {
            bar();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    public static void bar() throws Exception{
        throw new ClassNotFoundException();
    }
}

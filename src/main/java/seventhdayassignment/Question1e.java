package seventhdayassignment;

public class Question1e {
    public static void main(String[] args) {
        String s1="java";
        String s2=null;

        try {
            System.out.println("Entered in first try");
            if(s1.length()>0)
                System.out.println("length of s1 is: "+s1.length());
            else
                throw new NullPointerException();
            try {
                System.out.println("Entered in second try");
                System.out.println(s2.length());
            }
            catch (Exception e){
                System.out.println("inner catch"+e);
            }
        }
        catch (Exception e){
            System.out.println("outer catch"+e);
        }

    }
}

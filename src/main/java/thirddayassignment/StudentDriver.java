package thirddayassignment;

public class StudentDriver {
    public static void main(String[] args) {
        Student s1=new Student("101","Alex",40);
        s1.getLoginName();
        s1.changeStudentName("John");
        System.out.println(s1.getStudentId());
        System.out.println(s1.getStudentName());
        s1.addCredits(20);
        s1.getCredits();
    }

}

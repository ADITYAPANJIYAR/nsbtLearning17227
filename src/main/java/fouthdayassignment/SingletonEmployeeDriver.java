package fouthdayassignment;

public class SingletonEmployeeDriver {
    public static void main(String[] args) {
        SingletonEmployee e1=SingletonEmployee.createInstance();
        SingletonEmployee e2=SingletonEmployee.createInstance();
        System.out.println(e1);
        System.out.println(e2);
    }
}

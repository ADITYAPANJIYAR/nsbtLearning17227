package fouthdayassignment;

public class SingletonEmployee {
    private int empId;
    private String empFirstName;
    private String empLastName;
    private int salary;//represent monthly salary
    private static int count;

    private static SingletonEmployee employee=new SingletonEmployee();
    public static SingletonEmployee createInstance(){
        return employee;
    }
    private SingletonEmployee() {
        count++;
    }
}

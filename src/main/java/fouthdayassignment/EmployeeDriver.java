package fouthdayassignment;

public class EmployeeDriver {
    public static void main(String[] args) {
        //        Employee e1 = new Employee(8, "Amit", "Jain", 2500);

        Employee e1=Employee.createInstance();
        Employee e2=Employee.createInstance();
        Employee e3=Employee.createInstance();
        Employee e4=Employee.createInstance();

        e1.setSalary(999);
        System.out.println("salary is: " + e1.getSalary());
        e1.setEmpId(101);
        System.out.println("empId is: " + e1.getEmpId());

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);


    }
}

package thirddayassignment;

public class TestMainEmployee {

    public static void main(String[] args) {
        Employee e1 = new Employee(8, "Amit", "Jain", 2500);
        System.out.println("toString Value: "+e1); // toString();

        System.out.println("Employee[id="+e1.getEmpId()+",name="+e1.getEmpFirstName()+" "+e1.getEmpLastName()+",salary="+e1.getSalary()+"]");
        e1.setSalary(999);
        System.out.println("Employee[id="+e1.getEmpId()+",name="+e1.getEmpFirstName()+" "+e1.getEmpLastName()+",salary="+e1.getSalary()+"]");
        System.out.println("empId is: " + e1.getEmpId());
        System.out.println("firstname is: " + e1.getEmpFirstName());
        System.out.println("lastname is: " + e1.getEmpLastName());
        System.out.println("salary is: " + e1.getSalary());
        System.out.println("annual salary is: " + e1.getAnnualSalary());


        Employee e2=new Employee(8,"Peter","Tan",1098);
        System.out.println("Raised salary: "+e1.raiseSalary(10));
        System.out.println(e1);

    }

}

package fouthdayassignment;

public class Employee {
    private int empId;
    private String empFirstName;
    private String empLastName;
    private int salary;//represent monthly salary
    private static int count;

    //methods...
    public int getAnnualSalary(){
        return salary*12;
    }
    public int raiseSalary(int percent){
        salary=salary+((salary*percent)/100);
        return salary;
    }

    @Override
    public String toString(){
        return ("Employee[id="+getEmpId()+",name="+getEmpFirstName()+" "+getEmpLastName()+",salary="+getSalary()+"]");
    }

    //constructors...

    public static Employee createInstance(){
        if(count<3)
            return new Employee();
        else
            return null;
    }

    private Employee() {
        count++;
    }

    private Employee(int empId, String empFirstName, String empLastName, int salary) {
        this.empId = empId;
        this.empFirstName = empFirstName;
        this.empLastName = empLastName;
        this.salary = salary;
    }


    //Getter ans setters...
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public int getEmpId() {
        return empId;
    }

    public void setEmpFirstName(String empFirstName) {
        this.empFirstName = empFirstName;
    }
    public String getEmpFirstName(){
        return empFirstName;
    }

    public String getEmpLastName() {
        return empLastName;
    }

    public void setEmpLastName(String empLastName) {
        this.empLastName = empLastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

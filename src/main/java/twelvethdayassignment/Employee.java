package twelvethdayassignment;

public class Employee implements Comparable<Employee>{
    int empId;
    String empName;
    double salary;

    public Employee(){}
    public Employee(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary=salary;
    }

    @Override
    public int compareTo(Employee employee) {
        return this.empId-employee.empId;
    }



    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

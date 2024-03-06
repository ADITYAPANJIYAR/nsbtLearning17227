package thirteenthdayassignment;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import twelvethdayassignment.Employee;
import java.util.Comparator;
import java.util.TreeSet;

public class Question3 {
    private static final Logger log= LogManager.getLogger(Question3.class);
    public static void main(String[] args) {
        Comparator<Employee> name=(Employee1, Employee2)-> -Employee1.getEmpName().compareToIgnoreCase(Employee2.getEmpName());
        TreeSet<Employee> employeeHashSet=new TreeSet<>(name);
        employeeHashSet.add(new Employee(102,"John",400000));
        employeeHashSet.add(new Employee(101,"Alice",500000));
        Employee e3=new Employee(103,"Alex",9000);
        employeeHashSet.add(e3);

        log.info("after applying reverse Comparator");
        for (Employee element : employeeHashSet) {
            log.info(element.getEmpName());
        }
    }
}

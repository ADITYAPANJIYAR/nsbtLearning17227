package thirteenthdayassignment;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import twelvethdayassignment.Employee;

import java.util.Comparator;
import java.util.TreeSet;

public class Question2 {
    private static final Logger log= LogManager.getLogger(Question2.class);
    public static void main(String[] args) {
        Comparator<Employee> name=(employee1,employee2)-> employee1.getEmpName().compareToIgnoreCase(employee2.getEmpName());

        TreeSet<Employee> employeeHashSet=new TreeSet<>(name);
        employeeHashSet.add(new Employee(102,"John",400000));
        employeeHashSet.add(new Employee(101,"Alice",500000));
        Employee e3=new Employee(103,"Alex",9000);
        employeeHashSet.add(e3);

        log.info("Before removal");
        for (Employee element : employeeHashSet) {
            log.info(element.getEmpName());
        }

        employeeHashSet.remove(e3);
        log.info("After removal");
        for (Employee element : employeeHashSet) {
            log.info(element.getEmpName());
        }

        log.info(employeeHashSet.size());
        boolean check=employeeHashSet.contains(e3);
        log.info(check);

        log.info("after applying Comparator");
        for (Employee element : employeeHashSet) {
            log.info(element.getEmpName());
        }


    }
}

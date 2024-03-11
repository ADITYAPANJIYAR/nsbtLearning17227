package twelvethdayassignment;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashSet;
import java.util.Iterator;

public class Question7 {
    private static final Logger log= LogManager.getLogger(Question7.class);
    public static void main(String[] args) {
        HashSet<Employee> employeeHashSet=new HashSet<>();
        employeeHashSet.add(new Employee(1,"A",45000));
        employeeHashSet.add(new Employee(5,"D",55000));
        employeeHashSet.add(new Employee(7,"B",35000));
        employeeHashSet.add(new Employee(2,"P",75000));
        employeeHashSet.add(new Employee(1,"A",45000));

        log.info(employeeHashSet.size());//it is printing 5 because it is creating new memory for every employee.

        Iterator<Employee> iterator = employeeHashSet.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employee != null) {
                log.info(employee.empName);
            }
        }

    }
}

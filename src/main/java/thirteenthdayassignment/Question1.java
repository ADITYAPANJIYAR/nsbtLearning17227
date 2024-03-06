package thirteenthdayassignment;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import twelvethdayassignment.Employee;
import java.util.HashSet;
import java.util.Iterator;

public class Question1 {
    private static final Logger log= LogManager.getLogger(Question1.class);
    public static void main(String[] args) {
        HashSet<Employee> employeeHashSet=new HashSet<>();
        employeeHashSet.add(new Employee(102,"John",400000));
        employeeHashSet.add(new Employee(101,"Alice",500000));
        Employee e3=new Employee(103,"Alex",9000);
        employeeHashSet.add(e3);

//        log.info("Before removal");
//        for (Employee element : employeeHashSet) {
//            log.info(element.getEmpName());
//        }
//
//        employeeHashSet.remove(e3);
//        log.info("After removal");
//        for (Employee element : employeeHashSet) {
//            log.info(element.getEmpName());
//        }
//
//        log.info(employeeHashSet.size());
//        boolean check=employeeHashSet.contains(e3);
//        log.info(check);

        Iterator<Employee> iterator= employeeHashSet.iterator();
        while (iterator.hasNext()){
            Employee employee=iterator.next();
            if(employee.getSalary()<10000)
                iterator.remove();
        }
        for (Employee element : employeeHashSet) {
            log.info(element.getEmpName());
        }

    }
}

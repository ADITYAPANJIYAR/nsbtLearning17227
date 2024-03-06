package twelvethdayassignment;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Question1Driver {
    private static final Logger log = LogManager.getLogger(Question1Driver.class);
    public static void main(String[] args) {
        ArrayList<Employee> employeeArrayList=new ArrayList<>();

        //question a
        employeeArrayList.add(new Employee(101,"Alice",500000));
        employeeArrayList.add(new Employee(102,"John",400000));
        employeeArrayList.add(new Employee(103,"Alex",9000));

//        question b
        employeeArrayList.remove(2);

//        question 3
        log.info("Printing using for loop:");
        for (int i = 0; i < employeeArrayList.size(); i++) {
            log.info(employeeArrayList.get(i));
        }

        log.info("\nPrinting using for-each loop:");
        for (Employee element: employeeArrayList) {
            log.info(element.empName);
        }

//        log.info("\nPrinting using Iterator Interface:");
//        Iterator<Employee> iterator=employeeArrayList.iterator();
//        while (iterator.hasNext()){
//            log.info(iterator.next().empName);
//        }

        log.info("\nPrinting backward using ListIterator interface:");
        ListIterator<Employee> listIterator=employeeArrayList.listIterator(employeeArrayList.size());
        while (listIterator.hasPrevious())
            log.info(listIterator.previous().empName);

//        Remove all instances from the list with salary less than 10000
        Iterator<Employee> iterator= employeeArrayList.iterator();
        while (iterator.hasNext()){
            Employee employee=iterator.next();
            if(employee.salary<10000)
                iterator.remove();
        }

        for (int i = 0; i < employeeArrayList.size(); i++) {
            log.info(employeeArrayList.get(i).empName);
        }
    }

}

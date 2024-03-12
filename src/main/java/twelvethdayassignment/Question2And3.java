package twelvethdayassignment;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Question2And3 {
    private static final Logger log= LogManager.getLogger(Question2And3.class);
    public static void main(String[] args) {
        List<Employee> employeeList=new ArrayList<>();
        employeeList.add(new Employee(5,"A",45000));
        employeeList.add(new Employee(2,"B",30000));
        employeeList.add(new Employee(7,"C",80000));
        boolean check=employeeList.contains(new Employee(5,"A",45000));
        log.info(check);
        employeeList.remove(new Employee(5,"A",45000));
        log.info(employeeList.size());

        Collections.sort(employeeList);
        Iterator<Employee> iterator=employeeList.iterator();
        while (iterator.hasNext()){
            log.info(iterator.next().empId);
        }
    }
}

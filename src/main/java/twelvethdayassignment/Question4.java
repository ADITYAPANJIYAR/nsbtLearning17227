package twelvethdayassignment;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Question4 {
    private static final Logger log=LogManager.getLogger(Question4.class);
    public static void main(String[] args) {
        List<Employee> employeeList=new ArrayList<>();
        employeeList.add(new Employee(5,"A",45000));
        employeeList.add(new Employee(2,"B",30000));
        employeeList.add(new Employee(7,"C",80000));

//        Comparator<Employee> comparator=new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
////                return Double.compare(o1.salary,o2.salary);
//                return (int) (o1.salary-o2.salary);
//            }
//        };
//        employeeList.sort(comparator);
//        for (Employee element: employeeList) {
//            log.info(element.salary);
//        }

        Comparator<Employee> comparator=(c1,c2)->(int)(c1.salary-c2.salary);
        employeeList.sort(comparator);
        for (Employee element: employeeList) {
            log.info(element.salary);
        }

    }
}

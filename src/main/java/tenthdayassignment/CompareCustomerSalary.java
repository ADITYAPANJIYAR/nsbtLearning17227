package tenthdayassignment;

import eighthdayassignment.question2.customer.Customer;

import java.util.Comparator;

public class CompareCustomerSalary implements Comparator<Customer> {

    @Override
    public int compare(Customer c1, Customer c2) {
        return (int)(c1.getMonthIncome()-c2.getMonthIncome());
    }
}

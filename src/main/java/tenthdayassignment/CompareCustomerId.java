package tenthdayassignment;

import eighthdayassignment.question2.customer.Customer;

import java.util.Comparator;

public class CompareCustomerId implements Comparator<Customer> {

    @Override
    public int compare(Customer c1, Customer c2) {
        return c1.getCustomerId()-c2.getCustomerId();
    }
}

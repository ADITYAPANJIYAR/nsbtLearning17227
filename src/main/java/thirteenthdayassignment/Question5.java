package thirteenthdayassignment;

import eighthdayassignment.question2.customer.Customer;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Question5 {
    private static final Logger log= LogManager.getLogger(Question5.class);
    public static void main(String[] args) {
        Customer c1=new Customer(101,"John",2500,25000,24,12);
        Customer c2=new Customer(102,"Alex",3500,20000,24,12);
        Customer c3=new Customer(103,"Olivia",3500,20000,24,12);

        Bank bank=Bank.getInstance();
        bank.registerCustomer(c1);
        bank.registerCustomer(c2);
        bank.registerCustomer(c3);

        log.info(bank.findCustomer(c1));
        bank.printAllCustomer();

    }
}
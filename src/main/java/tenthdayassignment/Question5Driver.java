package tenthdayassignment;

import eighthdayassignment.question2.bank.Bank;
import eighthdayassignment.question2.customer.Customer;

public class Question5Driver {
    public static void main(String[] args) {
        Bank bank=Bank.getInstance();
        Customer c1=new Customer(103,"John",2500,25000,24,12);
        Customer c2=new Customer(102,"Alex",3500,20000,24,12);
        Customer c3=new Customer(101,"Olivia",3500,200,24,12);
        bank.registerCustomer(c1);
        bank.registerCustomer(c2);
        bank.registerCustomer(c3);
        System.out.println("sorting based on id");
        bank.printAllCustomer(new CompareCustomerId());
        System.out.println("sorting based on salary");
        bank.printAllCustomer(new CompareCustomerSalary());

    }
}

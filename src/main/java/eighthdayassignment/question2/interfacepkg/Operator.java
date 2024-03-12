package eighthdayassignment.question2.interfacepkg;

import eighthdayassignment.question2.customer.Customer;

public interface Operator {
    void printAllLoanProduct();
    void printAllLoanProductDtl(String loanProductCode);
    void calculateLTVForLoanProduct();
    boolean findCustomer(Customer customer);
    Customer findCustomer(int customerId);
    void printAllCustomer();

}

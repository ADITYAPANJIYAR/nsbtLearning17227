package eighthdayassignment.question2.interfacepkg;

import eighthdayassignment.question2.loanproductpkg.LoanProduct;
import eighthdayassignment.question2.customer.Customer;

public interface Maker {
    boolean registerCustomer(Customer customer);
    boolean deleteCustomer(int customerId);
    boolean addNewLoanProduct(LoanProduct loanProduct);
    boolean removeLoanProduct(String loanProductCode);

}

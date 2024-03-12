package thirddayassignment;

import eighthdayassignment.question2.bank.Bank;
import eighthdayassignment.question2.customer.Customer;
import eighthdayassignment.question2.interfacepkg.Maker;
import eighthdayassignment.question2.interfacepkg.Operator;

public class CustomerDriver {
    public static void main(String[] args) {
        Customer c1=new Customer(101,"John",2500,25000,24,12);

//        System.out.println(c1.getCustomerId());
//        System.out.println(c1.getCustomerName());
//        System.out.println(c1.getMonthlyExpense());
//        System.out.println(c1.getMonthIncome());
//        System.out.println(c1.getTenure());
//        System.out.println(c1.getRate());
//        System.out.println(c1.dbr());
//        System.out.println(c1.calculateEmiAmount());
//        System.out.println(c1.eligibleLoanAmount());

        Customer c2=new Customer(102,"Alex",3500,20000,24,12);
//        System.out.println(c2.getCustomerId());

//        Bank bank=new Bank();
//        bank.registerCustomer(c1);
//        bank.registerCustomer(c2);
//        bank.printAllCustomer();
//        bank.deleteCustomer(102);

        Maker maker;
//        Bank bank=new Bank();
        Bank bank=Bank.getInstance();
        maker=bank;
        maker.registerCustomer(c1);

        Operator operator;
        operator=bank;
        boolean flag=false;
        flag=operator.findCustomer(c1);
        System.out.println(flag);
        flag=operator.findCustomer(c2);
        System.out.println(flag);
    }
}

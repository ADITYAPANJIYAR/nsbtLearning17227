package fifthdayassignment;

import eighthdayassignment.question2.bank.Bank;
import eighthdayassignment.question2.loanproductpkg.ConsumerVehicleLoan;
import eighthdayassignment.question2.loanproductpkg.EducationLoan;
import eighthdayassignment.question2.loanproductpkg.HomeLoan;
import eighthdayassignment.question2.loanproductpkg.LoanProduct;

public class Test {
    public static void main(String[] args) {
//        LoanProduct loanProduct1=new LoanProduct("vehicle","car"); abstract class made
        LoanProduct consumerVehicleLoan1=new ConsumerVehicleLoan(100000);
        LoanProduct homeLoan1=new HomeLoan(4000000);
        LoanProduct educationLoan1=new EducationLoan(500000);
//        LoanProduct educationLoan1=new EducationLoan();  upper casting

        //method testing
//        System.out.println(consumerVehicleLoan1.ltvCalculateAsPerCollateralType(10000));
//        System.out.println(homeLoan1.ltvCalculateAsPerCollateralType(2000000));
//        System.out.println(educationLoan1.ltvCalculateAsPerCollateralType(300000));

        educationLoan1.setLoanProductName("college");
        educationLoan1.setLoanProductCode("101");
//        Bank bank=new Bank();
        Bank bank=Bank.getInstance();
        bank.addNewLoanProduct((EducationLoan) educationLoan1);
        bank.printAllLoanProduct();
    }
}

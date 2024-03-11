package thirteenthdayassignment;

import eighthdayassignment.question2.customer.Customer;
import eighthdayassignment.question2.enumpkg.EmiStatus;
import eighthdayassignment.question2.enumpkg.LoanStatus;
import eighthdayassignment.question2.loanmanagementpkg.LoanAgreement;
import java.time.LocalDate;

public class Question6 {
    public static void main(String[] args) {
        Customer c1=new Customer(101,"John",2500,25000,24,12);
        Customer c2=new Customer(102,"Alex",3500,20000,24,12);
        Customer c3=new Customer(103,"Olivia",3500,20000,24,12);

        LoanAgreement loanAgreement1=new LoanAgreement(1,5000, LoanStatus.PENDING, EmiStatus.ACTIVE, LocalDate.of(2000,11,16));
        LoanAgreement loanAgreement2=new LoanAgreement(2,1000, LoanStatus.APPROVE, EmiStatus.ACTIVE,LocalDate.of(2001,7,30));
        LoanAgreement loanAgreement3=new LoanAgreement(3,10000, LoanStatus.CLOSED, EmiStatus.ACTIVE,LocalDate.of(2007,11,13));


        c1.addLoan(loanAgreement1);
        c1.addLoan(loanAgreement2);
        c1.addLoan(loanAgreement2);//checking for duplicate loan.

        c2.addLoan(loanAgreement1);
        c2.addLoan(loanAgreement3);
        c2.addLoan(loanAgreement2);

        c3.addLoan(loanAgreement3);

//        c1.printLoan();
//        c2.printLoan();
//        c2.removeLoan(loanAgreement1);

//        c2.sortOnLoanAmount();
//        c1.sortOnDisbursalDate();
//        c2.sortOnDisbursalDate();
//        c2.getStatus();
        c2.printLoan();
        c2.removeClosedLoan();
        c2.printLoan();

    }
}

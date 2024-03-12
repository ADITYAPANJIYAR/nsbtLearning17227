package fourteenthdayassignment;

import eighthdayassignment.question2.customer.Customer;
import eighthdayassignment.question2.enumpkg.EmiStatus;
import eighthdayassignment.question2.enumpkg.LoanStatus;
import eighthdayassignment.question2.loanmanagementpkg.LoanAgreement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.time.LocalDate;

public class Question9 {
    private static final Logger log= LogManager.getLogger(Question9.class);
    public static void main(String[] args) {
        Customer c1 = new Customer(101, "John", 2500, 25000, 24, 12);
        Customer c2 = new Customer(102, "Alex", 3500, 20000, 24, 12);
        Customer c3 = new Customer(103, "Olivia", 3500, 20000, 24, 12);

        LoanAgreement loanAgreement1 = new LoanAgreement(1, 5000, LoanStatus.PENDING, EmiStatus.ACTIVE, LocalDate.of(2000, 11, 16));
        LoanAgreement loanAgreement2 = new LoanAgreement(2, 1000, LoanStatus.APPROVE, EmiStatus.ACTIVE, LocalDate.of(2001, 7, 30));
        LoanAgreement loanAgreement3 = new LoanAgreement(3, 10000, LoanStatus.CLOSED, EmiStatus.ACTIVE, LocalDate.of(2007, 11, 13));

        c1.addLoan(loanAgreement1);
        c1.addLoan(loanAgreement2);
        c1.addLoan(loanAgreement3);
        c1.addLoan(loanAgreement2);//checking for duplicate loan.

        log.info(c1
                .stream()
               .count());


    }

}

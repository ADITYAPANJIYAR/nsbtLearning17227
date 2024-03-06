package thirddayassignment;


import eighthdayassignment.question2.enumpkg.Frequency;
import eighthdayassignment.question2.loanmanagementpkg.LoanAgreement;

public class LoanAgreementDriver {
    public static void main(String[] args) {
        LoanAgreement l1=new LoanAgreement(101,800000,5,9.75, Frequency.MONTHLY);

        System.out.println(l1.calculateInstallmentAmount());
        System.out.println(l1.ltv(100000));
        l1.repaymentSchedule();
    }
}

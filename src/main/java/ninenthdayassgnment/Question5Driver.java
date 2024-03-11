package ninenthdayassgnment;

import eighthdayassignment.question2.enumpkg.EmiStatus;
import eighthdayassignment.question2.loanmanagementpkg.LoanAgreement;
import eighthdayassignment.question2.enumpkg.LoanStatus;
import java.util.function.Predicate;

public class Question5Driver {
    public static void main(String[] args) {
        LoanAgreement []loanAgreement=new LoanAgreement[3];
        loanAgreement[0]=new LoanAgreement(101,100000, LoanStatus.APPROVE, EmiStatus.ACTIVE);
        loanAgreement[1]=new LoanAgreement(102,500000, LoanStatus.APPROVE,EmiStatus.ACTIVE);
        loanAgreement[2]=new LoanAgreement(103,1000000, LoanStatus.REJECTED,EmiStatus.PENDING);

        Predicate<LoanStatus> checkLoanStatus = loanStatus -> loanStatus==LoanStatus.APPROVE;
        Predicate<EmiStatus> checkEmiStatus = emiStatus -> emiStatus==EmiStatus.ACTIVE;
        for (int i = 0; i < loanAgreement.length; i++) {
            if(checkLoanStatus.test(loanAgreement[i].getLoanStatus()) && checkEmiStatus.test(loanAgreement[i].getEmiStatus()))
                System.out.println(loanAgreement[i].getLoanAgreementId());
        }

    }
}

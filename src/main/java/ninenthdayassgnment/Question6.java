package ninenthdayassgnment;


import eighthdayassignment.question2.enumpkg.EmiStatus;
import eighthdayassignment.question2.enumpkg.LoanStatus;
import eighthdayassignment.question2.loanmanagementpkg.LoanAgreement;
import java.util.Comparator;

public class Question6 {

    public static void main(String[] args) {
        LoanAgreement []loanAgreement=new LoanAgreement[3];
        loanAgreement[0]=new LoanAgreement(101,100000, LoanStatus.APPROVE, EmiStatus.ACTIVE);
        loanAgreement[1]=new LoanAgreement(102,500000, LoanStatus.APPROVE,EmiStatus.ACTIVE);
        loanAgreement[2]=new LoanAgreement(103,1000000, LoanStatus.REJECTED,EmiStatus.PENDING);

        Comparator<LoanAgreement> check=(loan1, loan2)->(int)(loan1.getLoanAmount()-loan2.getLoanAmount());

        for (int i = 0; i < loanAgreement.length - 1; i++) {
            for (int j = 0; j < loanAgreement.length - i - 1; j++) {
                if (check.compare(loanAgreement[j], loanAgreement[j + 1]) > 0) {
                    // Swap the elements
                    LoanAgreement temp = loanAgreement[j];
                    loanAgreement[j] = loanAgreement[j + 1];
                    loanAgreement[j + 1] = temp;
                }
            }
        }
        for (LoanAgreement agreement : loanAgreement) {
            System.out.println(agreement.getLoanAmount());
        }
    }
}

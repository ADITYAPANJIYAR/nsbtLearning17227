package fouthdayassignment;

public class LoanAgreementDriver {
    public static void main(String[] args) {

        LoanAgreement l1=new LoanAgreement(800000,5,9.75, Frequency.MONTHLY);
        System.out.println(l1.getLoanAgreementId());

        LoanAgreement l2=new LoanAgreement(900000,5,9.75, Frequency.QUATERLY);
        System.out.println(l2.getLoanAgreementId());
    }
}

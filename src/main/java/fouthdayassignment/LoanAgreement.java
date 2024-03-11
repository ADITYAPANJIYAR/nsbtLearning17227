package fouthdayassignment;
import java.time.LocalDate;

enum Frequency{
    YEARLY(1),
    HALFYEARLY(2),
    QUATERLY(3),
    MONTHLY(12);

    public int getNumberOfPayment() {
        return numberOfPayment;
    }

    private int numberOfPayment;

    Frequency(int numberOfPayment){
        this.numberOfPayment=numberOfPayment;
    }

}


public class LoanAgreement {
    private int loanAgreementId;
    private double loanAmount;
    private int tenure;
    private double roi;
    enum loanStatus {
        APPROVE,
        PENDING,
        REJECTED;
    }
    private double emiPerMonth;
    private LocalDate loanDisbursalDate;
    private final Frequency repaymentFrequency;
    private static int countLoanAgreementId;


    //constructors...
    public LoanAgreement( double loanAmount, int tenure, double roi, Frequency repaymentFrequency) {
        loanAgreementId = ++countLoanAgreementId;
        this.loanAmount = loanAmount;
        this.tenure = tenure;
        this.roi = roi;
        this.repaymentFrequency = repaymentFrequency;
    }
    //methods...
    public double calculateInstallmentAmount(){
        int numberOfPayment=repaymentFrequency.getNumberOfPayment();
        int t = tenure*numberOfPayment;
        double rv=0;
        double newRoi=roi/100;
        double div=newRoi/numberOfPayment;
        double power=Math.pow(1+div,t);
        double ans=(loanAmount*div)-(rv*div/power);
        ans=ans/(1-(1/power));
        return ans;
    }
    public double ltv(double propertyValue) {
        return (loanAmount/propertyValue);

    }
    public void repaymentSchedule(){
        int numberOfPayment=repaymentFrequency.getNumberOfPayment();
        int t = tenure*numberOfPayment;
        double installment=calculateInstallmentAmount();
        System.out.println("Installment No."+"  Opening Balance"+"  Interest component"+"  Principal Component"+"  Installment");
        String s="          ";
        double intrestComponent;
        double principalComponent;
        for(int i=1;i<=t;i++){
            intrestComponent=loanAmount*(roi/1200);
            principalComponent=installment-intrestComponent;
            System.out.println(i+s+ loanAmount+s+ intrestComponent+s+ principalComponent+s+installment);
            loanAmount=loanAmount-principalComponent;
        }
    }

    //getters and setters...

    public int getLoanAgreementId() {
        return loanAgreementId;
    }

    public void setLoanAgreementId(int loanAgreementId) {
        this.loanAgreementId = loanAgreementId;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public int getTenure() {
        return tenure;
    }

    public void setTenure(int tenure) {
        this.tenure = tenure;
    }

    public double getRoi() {
        return roi;
    }

    public void setRoi(double roi) {
        this.roi = roi;
    }

    public double getEmiPerMonth() {
        return emiPerMonth;
    }

    public void setEmiPerMonth(double emiPerMonth) {
        this.emiPerMonth = emiPerMonth;
    }

    public LocalDate getLoanDisbursalDate() {
        return loanDisbursalDate;
    }

    public void setLoanDisbursalDate(LocalDate loanDisbursalDate) {
        this.loanDisbursalDate = loanDisbursalDate;
    }

}


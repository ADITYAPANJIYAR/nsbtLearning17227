package eighthdayassignment.question2.loanmanagementpkg;
import eighthdayassignment.question2.enumpkg.EmiStatus;
import eighthdayassignment.question2.enumpkg.Frequency;
import eighthdayassignment.question2.enumpkg.LoanStatus;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.time.LocalDate;

public class LoanAgreement {
    private static final Logger log= LogManager.getLogger(LoanAgreement.class);
    private int loanAgreementId;
    private double loanAmount;
    private int tenure;
    private double roi;
    private LoanStatus loanStatus;
    private EmiStatus emiStatus;
    private double emiPerMonth;
    private LocalDate loanDisbursalDate;
    private Frequency repaymentFrequency;


    //constructors...
    public LoanAgreement(int loanAgreementId, double loanAmount, LoanStatus loanStatus, EmiStatus emiStatus) {
        this.loanAgreementId = loanAgreementId;
        this.loanAmount = loanAmount;
        this.loanStatus = loanStatus;
        this.emiStatus=emiStatus;
    }
    public LoanAgreement(int loanAgreementId, double loanAmount, LoanStatus loanStatus, EmiStatus emiStatus, LocalDate loanDisbursalDate) {
        this.loanAgreementId = loanAgreementId;
        this.loanAmount = loanAmount;
        this.loanStatus = loanStatus;
        this.emiStatus=emiStatus;
        this.loanDisbursalDate=loanDisbursalDate;
    }

    public LoanAgreement(int loanAgreementId, double loanAmount, int tenure, double roi, Frequency repaymentFrequency) {
        this.loanAgreementId=loanAgreementId;
        this.loanAmount = loanAmount;
        this.tenure = tenure;
        this.roi = roi;
        this.repaymentFrequency = repaymentFrequency;
    }

    public LoanAgreement(int loanAgreementId, double loanAmount) {
        this.loanAgreementId=loanAgreementId;
        this.loanAmount=loanAmount;
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
        log.info("Installment No."+"  Opening Balance"+"  Interest component"+"  Principal Component"+"  Installment");
        String s="          ";
        double interestComponent;
        double principalComponent;
        for(int i=1;i<=t;i++){
            interestComponent=loanAmount*(roi/1200);
            principalComponent=installment-interestComponent;
            log.info(i+s+ loanAmount+s+ interestComponent+s+ principalComponent+s+installment);
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

    public LoanStatus getLoanStatus() {
        return loanStatus;
    }

    public void setLoanStatus(LoanStatus loanStatus) {
        this.loanStatus = loanStatus;
    }

    public EmiStatus getEmiStatus() {
        return emiStatus;
    }

    public void setEmiStatus(EmiStatus emiStatus) {
        this.emiStatus = emiStatus;
    }
}

package eighthdayassignment.question2.customer;

import eighthdayassignment.question2.enumpkg.LoanStatus;
import eighthdayassignment.question2.loanmanagementpkg.LoanAgreement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.time.Period;
import java.util.*;
import java.util.stream.Stream;

public class Customer {
    private static final Logger log= LogManager.getLogger(Customer.class);
    private List<LoanAgreement> loanAgreementList=new ArrayList<>();
    private int customerId;
    private  String customerName;
    private double monthlyExpense;
    private double monthIncome;
    private double tenure;
    private double rate;
    private int age;

    //Constructors...
    public Customer(int customerId){
        this.customerId=customerId;
    }
    public Customer(int customerId, String customerName, double monthIncome, int age) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.monthIncome = monthIncome;
        this.age = age;
    }

    public Customer(int customerId, String customerName, double monthlyExpense, double monthIncome, double tenure, double rate) {
        this.customerId = customerId;
        this.customerName =customerName;
//        this.customerName = "Aditya";//can change the value in constructor
        this.monthlyExpense = monthlyExpense;
        this.monthIncome = monthIncome;
        this.tenure = tenure;
        this.rate = rate;
    }

    //methods...
    public void removeClosedLoan(){
        for (LoanAgreement element: loanAgreementList){
            if (element.getLoanStatus()==LoanStatus.CLOSED)
                loanAgreementList.remove(element);
        }
    }
    public void getStatus(){
        for (LoanAgreement element: loanAgreementList){
            if (element.getLoanStatus()==LoanStatus.PENDING)
                log.info(element.getLoanAgreementId());
        }
    }
    public void addLoan(LoanAgreement loanAgreement)
    {
        if(loanAgreement!=null && !loanAgreementList.contains(loanAgreement)){
            loanAgreementList.add(loanAgreement);
        }
    }

    public void printLoan(){
        for (LoanAgreement loan:loanAgreementList) {
            log.info("Loan id is: "+loan.getLoanAgreementId());
        }
    }
    public void removeLoan(LoanAgreement loanAgreement){
        if(loanAgreementList.contains(loanAgreement)){
            loanAgreementList.remove(loanAgreement);
            log.info("Loan removed.");
        }
        else
            log.info("No loan found for this customer.");
    }

    public void sortOnLoanAmount(){
        Comparator<LoanAgreement> amount=(amount1,amount2)->(int)(amount1.getLoanAmount()-amount2.getLoanAmount());
        Collections.sort(loanAgreementList,amount);
        for (LoanAgreement element: loanAgreementList) {
            log.info(element.getLoanAmount());
        }
    }

    public void sortOnDisbursalDate(){
        Comparator<LoanAgreement> date=(date1,date2)->(Period.between(date1.getLoanDisbursalDate(),date2.getLoanDisbursalDate()).getDays());
        Collections.sort(loanAgreementList,date);
        for (LoanAgreement element: loanAgreementList) {
            log.info(element.getLoanDisbursalDate());
        }
    }

    @Override
    public boolean equals(Object obj){
        return (obj instanceof Customer && this.customerId==((Customer) obj).customerId);
    }

    public double dbr(){
        return (monthlyExpense/monthIncome);
    }
    public double calculateEmiAmount(){
        return ((monthIncome-(0.2* monthIncome* dbr()))/2);
    }

    public double eligibleLoanAmount(){
        tenure=tenure*12;
        rate=rate/1200;
        double e=((monthIncome-(0.2* monthIncome* dbr()))/2);
        double val=Math.pow(1+rate,tenure);
        return ( (e*(val-1))/(rate*val) );
    }

    public Stream stream(){
        return loanAgreementList.stream().parallel();
    }


    //getter and setters...
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getMonthlyExpense() {
        return monthlyExpense;
    }

    public void setMonthlyExpense(double monthlyExpense) {
        this.monthlyExpense = monthlyExpense;
    }

    public double getMonthIncome() {
        return monthIncome;
    }

    public void setMonthIncome(double monthIncome) {
        this.monthIncome = monthIncome;
    }

    public double getTenure() {
        return tenure;
    }

    public void setTenure(double tenure) {
        this.tenure = tenure;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public List<LoanAgreement> getLoanAgreementList() {
        return loanAgreementList;
    }

    public void setLoanAgreementList(List<LoanAgreement> loanAgreementList) {
        this.loanAgreementList = loanAgreementList;
    }
}

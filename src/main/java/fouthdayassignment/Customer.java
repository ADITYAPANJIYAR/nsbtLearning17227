package fouthdayassignment;

public class Customer {
    private int customerId;
    private String customerName;
    private double monthlyExpense;
    private double monthIncome;
    private double tenure;
    private double rate;
    private static int countCustomerId;

    //Constructors...
    public Customer( String customerName, double monthlyExpense, double monthIncome, double tenure, double rate) {
        countCustomerId++;
        customerId = countCustomerId;
        this.customerName = customerName;
        this.monthlyExpense = monthlyExpense;
        this.monthIncome = monthIncome;
        this.tenure = tenure;
        this.rate = rate;
    }

    //methods...
    public static void displayCustomerCount(){
        System.out.println("Count of customer is:"+countCustomerId);
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

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
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

}
package eighthdayassignment.question2.customer;

public class Customer {
    private int customerId;
    private final String customerName;
    private double monthlyExpense;
    private double monthIncome;
    private double tenure;
    private double rate;
    private int age;

    //Constructors...
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
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Customer && this.customerId==((Customer) obj).customerId){
            return true;
        }
        return false;
    }
//    public void assignCustomerName(String customerName){
//        this.customerName=customerName;// cannot change final variable in method...
//    }
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

//    public void setCustomerName(String customerName) {
//        this.customerName = customerName;
//    }

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
}

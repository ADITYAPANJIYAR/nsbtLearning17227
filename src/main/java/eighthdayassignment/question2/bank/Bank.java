package eighthdayassignment.question2.bank;

import eighthdayassignment.Question3;
import eighthdayassignment.question2.loanproductpkg.ConsumerVehicleLoan;
import eighthdayassignment.question2.loanproductpkg.EducationLoan;
import eighthdayassignment.question2.loanproductpkg.HomeLoan;
import eighthdayassignment.question2.loanproductpkg.LoanProduct;
import eighthdayassignment.question2.interfacepkg.Maker;
import eighthdayassignment.question2.interfacepkg.Operator;
import eighthdayassignment.question2.customer.Customer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Comparator;

public class Bank implements Maker, Operator {
    private static final Logger log= LogManager.getLogger(Bank.class);
     private LoanProduct []loanProductsArray;
    private Customer []customerArray;
    private int customerCount=0;
    private int maxCustomer=100;
    private int maxLoanProduct=100;
    private int loanProductCount=0;

    //constructor...
    private static Bank INSTANCE= new Bank();
    public static Bank getInstance(){
        return INSTANCE;
    }
     private Bank(){
        customerArray=new Customer[maxCustomer];
        loanProductsArray=new LoanProduct[maxLoanProduct];
    }


    //methods for loan product...
    public boolean addNewLoanProduct(EducationLoan educationLoan){
         if(loanProductCount>=maxLoanProduct)
             return false;
         loanProductsArray[loanProductCount++]=educationLoan;
         return true;
    }
    public boolean addNewLoanProduct(HomeLoan homeLoan){
        if(loanProductCount>=maxLoanProduct)
            return false;
        loanProductsArray[loanProductCount++]=homeLoan;
        return true;
    }
    public boolean addNewLoanProduct(ConsumerVehicleLoan consumerVehicleLoan){
        if(loanProductCount>=maxLoanProduct)
            return false;
        loanProductsArray[loanProductCount++]=consumerVehicleLoan;
        return true;
    }

    public boolean addNewLoanProduct(LoanProduct loanProduct){
        if(loanProductCount>=maxLoanProduct)
            return false;
        loanProductsArray[loanProductCount++]=loanProduct;
        return true;
    }

    public boolean removeLoanProduct(String loanProductCode){
        int deleteCustomerId=-1;
        for (int i = 0; i < loanProductsArray.length; i++) {
            if (loanProductsArray[i].getLoanProductCode().equals(loanProductCode)){
                deleteCustomerId=i;
                break;
            }
        }
        if (deleteCustomerId==-1)
            return false;
        else {
            for (int i = deleteCustomerId; i < loanProductsArray.length-1 ; i++) {
                loanProductsArray[i]=loanProductsArray[i+1];
            }
        }
        loanProductsArray[maxLoanProduct-1]=null;
        maxLoanProduct--;
        return true;

    }
    public void printAllLoanProduct(){
        for (int i = 0; i < loanProductsArray.length; i++) {
            if(loanProductsArray[i] != null) {
                log.info("Product code is: "
                        + loanProductsArray[i].getLoanProductCode() +
                        " and Product name is: " +
                        loanProductsArray[i].getLoanProductName());
            }
        }
    }
    public void printAllLoanProductDtl(String loanProductCode){
        for (int i = 0; i < loanProductsArray.length; i++) {
            if(loanProductsArray[i].getLoanProductCode().equals(loanProductCode))
                log.info(loanProductsArray[i].getLoanProductName()+" "+loanProductsArray[i].getLoanProductCode());
        }
    }

    public void calculateLTVForLoanProduct(){
        for (int i = 0; i < loanProductsArray.length; i++) {
            if(loanProductsArray[i] != null){
                loanProductsArray[i].ltvCalculateAsPerCollateralType(200000);
            }
        }
    }

    //methods for customer...
    public boolean registerCustomer(Customer customer){
        if(customerCount>=maxCustomer || !(customer instanceof Customer) || findCustomer(customer))
            return false;
        customerArray[customerCount++]=customer;
        return true;
    }
    public Customer findCustomer(int customerId){
        for (int i = 0; i < customerArray.length; i++) {
            if(customerArray[i].getCustomerId()==customerId)
                return customerArray[i];

        }
        return null;
    }
    public void printAllCustomer(){
        for (int i = 0; i < customerArray.length; i++) {
            if(customerArray[i] != null) {
                log.info("customer id is: "
                        + customerArray[i].getCustomerId() +
                        " and customer name is: " +
                        customerArray[i].getCustomerName());
            }
        }
    }

    public void printAllCustomer(Comparator comparator) {
        // Use bubble sort to sort customers based on the provided comparator
        Customer temp;
        for (int i = 0; i < customerCount - 1; i++) {
            for (int j = 0; j < customerCount - i - 1; j++) {
                if (comparator.compare(customerArray[j], customerArray[j + 1]) > 0) {
                    temp = customerArray[j];
                    customerArray[j] = customerArray[j + 1];
                    customerArray[j + 1] = temp;
                }
            }
        }

        // Print the sorted customers up to 'n' customers
        for (int i = 0; i < customerCount; i++) {
            log.info("Customer id is: " + customerArray[i].getCustomerId() + " and customer name is: " + customerArray[i].getCustomerName());
        }
    }

    public boolean findCustomer(Customer customer){
        for (int i = 0; i < customerArray.length; i++) {
            if(customerArray[i] != null && customerArray[i].equals(customer))
                return true;
        }
        return false;
    }
    public boolean deleteCustomer(int customerId){
        int deleteCustomerId=-1;
        for (int i = 0; i < customerArray.length; i++) {
            if (customerArray[i].getCustomerId()==customerId){
                deleteCustomerId=i;
                break;
            }

        }
        if (deleteCustomerId==-1)
            return false;
        else {
            for (int i = deleteCustomerId; i < customerArray.length-1 ; i++) {
                customerArray[i]=customerArray[i+1];
            }
        }
        customerArray[maxCustomer-1]=null;
        maxCustomer--;
        return true;
    }

    public class Question4 implements Question3{
        private int counter=-1;

        @Override
        public boolean hasNext() {
            return counter+1 < customerCount && customerArray[counter + 1] != null;


        }

        @Override
        public Object next() {
            if(!hasNext())
                return false;
            return customerArray[++counter];
        }

        @Override
        public void remove() {
            if(counter==-1)
                return;
            customerArray[counter+1]=null;
        }
    }

}



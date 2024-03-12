package thirteenthdayassignment;


import eighthdayassignment.question2.customer.Customer;
import eighthdayassignment.question2.interfacepkg.Maker;
import eighthdayassignment.question2.interfacepkg.Operator;
import eighthdayassignment.question2.loanproductpkg.ConsumerVehicleLoan;
import eighthdayassignment.question2.loanproductpkg.EducationLoan;
import eighthdayassignment.question2.loanproductpkg.HomeLoan;
import eighthdayassignment.question2.loanproductpkg.LoanProduct;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.HashSet;

public class Bank implements Maker, Operator {
    private static final Logger log= LogManager.getLogger(Bank.class);
    private LoanProduct[]loanProductsArray;
    private HashSet<Customer> customerArray;
    private int customerCount=0;
    private final int  maxCustomer=100;
    private int maxLoanProduct=100;
    private int loanProductCount=0;

    //constructor...
    private static final Bank INSTANCE= new Bank();
    public static Bank getInstance(){
        return INSTANCE;
    }
    private Bank(){
        customerArray=new HashSet<>();
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
                log.info(String.format("Product code is: %s and Product name is: %s",
                        loanProductsArray[i].getLoanProductCode(),
                        loanProductsArray[i].getLoanProductName()));

            }
        }
    }
    public void printAllLoanProductDtl(String loanProductCode){
        for (int i = 0; i < loanProductsArray.length; i++) {
            if(loanProductsArray[i].getLoanProductCode().equals(loanProductCode))
                log.info(String.format("%s %s", loanProductsArray[i].getLoanProductName(), loanProductsArray[i].getLoanProductCode()));

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
        boolean added=customerArray.add(customer);
        if(added)
            customerCount++;
        return added;
    }
    public Customer findCustomer(int customerId){
        for(Customer customer:customerArray)
            if(customer.getCustomerId() == customerId)
                return  customer;
        return null;
    }

    public void printAllCustomer(){
        for (Customer customer:customerArray){
            if (customer!=null)
                log.info("customer id is: %d  and customer name is: %s.", customer.getCustomerId(), customer.getCustomerName());
        }
    }



    public boolean findCustomer(Customer customer){
        return (customerArray.contains(customer));
    }
    public boolean deleteCustomer(int customerId){
        Customer customerToRemove=null;
        for (Customer element: customerArray){
            if (element.getCustomerId()==customerId){
                customerToRemove=element;
                break;
            }
        }
        // If customer is not found, return false
        if(customerToRemove==null)
            return false;
        // Remove the customer from the HashSet
        boolean removed=customerArray.remove(customerToRemove);
        if (removed)
            customerCount--;
        return removed;
    }

}
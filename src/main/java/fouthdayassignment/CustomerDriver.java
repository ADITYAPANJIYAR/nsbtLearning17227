package fouthdayassignment;

public class CustomerDriver {
    public static void main(String[] args) {

        Customer c1=new Customer("John",2500,25000,24,12);
        System.out.println(c1.getCustomerId());

        Customer c2=new Customer("Alex",3500,20000,24,12);
        System.out.println(c2.getCustomerId());
        Customer.displayCustomerCount();

    }
}

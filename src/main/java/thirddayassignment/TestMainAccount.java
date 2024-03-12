package thirddayassignment;

public class TestMainAccount {
    public static void main(String[] args) {
        Account a1=new Account("A101","Sharma",88);
        System.out.println(a1);
        Account a2=new Account("A102","Kumar");
        System.out.println(a2);

        System.out.println("ID: " + a1.getId());
        System.out.println("Name:" + a1.getName());
        System.out.println("Balance:" + a1.getBalance());

        a1.credit(100);
        System.out.println("Balance after Credit"+a1.getBalance());
        a1.debit(50);
        System.out.println("Balance after Debit:"+a1.getBalance());
        a1.debit(500);
        System.out.println("Balance after Debit:"+a1.getBalance()); // debit() error


        // Test transfer()
        a1.transferTo(a2, 100);
        System.out.println("Balance after Transfer"+a2.getBalance());

        // toString()
        System.out.println("After toString Constructor");
        System.out.println(a1);

//        No arg constructor
        Account a3=new Account();
        System.out.println("ID: " + a3.getId());
        System.out.println("Name: " + a3.getName());
        System.out.println("Balance: " + a3.getBalance());

        //two arg constructor
        Account a4=new Account(12345,"Saving");
        System.out.println("ID: " + a4.getAccountNumber());
        System.out.println("Name: " + a4.getAccountType());
    }
}

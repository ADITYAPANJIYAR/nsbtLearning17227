package thirddayassignment;

public class Account {
    private String id;
    private String name;
    private int balance;
    private int accountNumber;
    private String accountType;

    //Methods...
    public  int credit(int amount){
        balance+=amount;
        return balance;
    }
    public  int debit(int amount){
        if(amount<=balance)
            balance-=amount;
        else
            System.out.println("Amount exceeds balance");
        return balance;
    }
    public void transferTo(Account newAcc,int amount){
        if(amount<=balance){
            newAcc.balance+=amount;
            balance-=amount;
        }
        else
            System.out.println("amount exceeds balance");
    }
    @Override
    public String toString(){
        return ("Account[id="+getId()+",name="+getName()+" "+",balance="+getBalance()+"]");

    }


    //Constructors...

    //Default constructor...
    public Account(){
        id="0";
        name="NA";
        balance=0;
    }

    public Account(int accountNumber, String accountType) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
    }

    //2 arg const...
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }
    //3 Arg const...
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
//        this(id,name); //Example of constructor calling...
        this.balance = balance;
    }


    //Getter ans setters
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

}

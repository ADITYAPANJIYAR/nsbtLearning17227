package seconddayassignment;

public class Day1 {
    public static void checkPassFail(int marks){
        if(marks>=50)
            System.out.println("PASS");
        else
            System.out.println("FAIL");
        System.out.println("DONE");
    }

    public static void printDayInWord(int day){
        if(day==0)
            System.out.println("Sunday");
        else if(day==1)
            System.out.println("Monday");
        else if(day==2)
            System.out.println("Tuesday");
        else if(day==3)
            System.out.println("Wednesday");
        else if(day==4)
            System.out.println("Thursday");
        else if(day==5)
            System.out.println("Friday");
        else if(day==6)
            System.out.println("Saturday");
        else
            System.out.println("Not a valid day");


    }

    public static double  incomeTaxCalculator(double amount){
        double tax=0;
        if(amount>60000){
            double remainingAmount=amount-60000;
            tax=tax+(remainingAmount*0.3);
            amount = amount- remainingAmount;
        }

        if(amount>=40000 && amount<=60000){
            double remainingAmount=amount-40000;
            tax=tax+(remainingAmount/5);
            amount=amount-remainingAmount;
        }
        if(amount>=20000 && amount<=40000){
            double remainingAmount=amount-20000;
            tax=tax+(remainingAmount/10);
        }
        return tax;
    }


    //question 4
    public static boolean checkPrime(int n){
        for(int i=2;i<=n/2;i++){
            if(n%i==0)
                return true;
        }
        return false;
    }
    public static void checkNumberType(int n){
        if(n%2==0)
            System.out.println("Even Number");
        else {
            if(checkPrime(n)) {
                System.out.println("odd non-prime number");
            }
            else
                System.out.println("odd prime number");
        }
    }

    //question 5
    public static void pascalTraingle(int n){
        int [][] triangle=new int[n][n];

        for (int line = 0; line < n; line++) {
            for (int i = 0; i <= line; i++) {
                if (i == 0 || i == line) {
                    triangle[line][i] = 1;
                } else {
                    triangle[line][i] = triangle[line - 1][i - 1] + triangle[line - 1][i];
                }
            }
        }

        // Print Pascal's Triangle
        System.out.println("Pascal's Triangle:");
        for (int line = 0; line < n; line++) {
            // Print leading spaces to make it look like a triangle
            for (int space = 0; space < n - line - 1; space++) {
                System.out.print(" ");
            }
            for (int i = 0; i <= line; i++) {
                System.out.print(triangle[line][i] + " ");
            }
            System.out.println();
        }
    }

    //

    public static double dbr(double expense, double monthlyIncome){
        return (expense/monthlyIncome);
    }
    public static void status(double dbr){

        if(dbr<=0.2)
            System.out.println("Approved");
        else if(dbr>0.4)
            System.out.println("Rejected");
        else
            System.out.println("Pending");
    }


    public static double ltv(double loanAmountAsked, double propertyValue) {
         return (loanAmountAsked/propertyValue);

    }

    public static double calculateEmiAmount(double expense, double monthlyIncome){
        return ((monthlyIncome-(0.2* monthlyIncome* dbr(expense,monthlyIncome)))/2);
    }
    public static double eligibleLoanAmount(double e, double r, double t){
        t=t*12;
        r=r/1200;
        double val=Math.pow(1+r,t);
        return ( (e*(val-1))/(r*val) );
    }

    public static double calculateInstallmentAmount(double principalAmount,double interest,double freq,double tenure,double rv){
        interest=interest/100;
        double div=interest/freq;
        double power=Math.pow(1+div,tenure);
        double ans=(principalAmount*div)-(rv*div/power);
        ans=ans/(1-(1/power));
        return ans;
    }

    public static void repaymentSchedule(double loanAmount, double rate, double tenure, double frequency,int n){
        double installment=calculateInstallmentAmount(loanAmount, rate, frequency,tenure,0);

        System.out.println("Installment No."+"  Opening Balance"+"  Interest component"+"  Principal Component"+"  Installment");
        String s="          ";
        double intrestComponent;
        double principalComponent;
        for(int i=1;i<=tenure;i++){
            intrestComponent=loanAmount*(rate/1200);
            principalComponent=installment-intrestComponent;
            System.out.println(i+s+ loanAmount+s+ intrestComponent+s+ principalComponent+s+installment);
            loanAmount=loanAmount-principalComponent;
            if (i==n)
                break;
        }
    }

}

package seconddayassignment;

import java.util.Scanner;

import static seconddayassignment.Day1.calculateEmiAmount;

public class Question8 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter monthly expense");
        double expense=scanner.nextDouble();
        System.out.println("Enter monthly income");
        double monthlyIncome=scanner.nextDouble();

        double e=calculateEmiAmount(expense, monthlyIncome);
        System.out.println("Enter rate");
        double r= scanner.nextDouble();
        System.out.println("Enter Tenure");
        double t= scanner.nextDouble();
        System.out.println("eligible loan amount is: "+ Day1.eligibleLoanAmount(e,r,t));
    }
}

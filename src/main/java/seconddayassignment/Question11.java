package seconddayassignment;

import java.util.Scanner;

import static seconddayassignment.Day1.repaymentSchedule;

public class Question11 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter loan amount");
        double loanAmount=scanner.nextDouble();

        System.out.println("Enter interest rate");
        double rate=scanner.nextDouble();

        System.out.println("Enter tenure in month");
        double tenure=scanner.nextDouble();

        System.out.println("Enter frequency");
        double frequency=scanner.nextDouble();

        System.out.println("Enter nth installment number");
        int n=scanner.nextInt();
        repaymentSchedule(loanAmount, rate,tenure, frequency,n);



    }
}

package seconddayassignment;

import java.util.Scanner;
import static seconddayassignment.Day1.repaymentSchedule;

public class Question10 {
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
        repaymentSchedule(loanAmount, rate,tenure, frequency,-1);


    }
}

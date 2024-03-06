package seconddayassignment;

import java.util.Scanner;
import static seconddayassignment.Day1.calculateInstallmentAmount;

public class Question9 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Principal Amount");
        double principalAmount=scanner.nextDouble();

        System.out.println("Enter interest ");
        double interest=scanner.nextDouble();

        System.out.println("Enter payment frequency");
        double freq=scanner.nextDouble();

        System.out.println("Enter tenure in month");
        double tenure=scanner.nextDouble();

        System.out.println("Enter Residual Value");
        double rv=scanner.nextDouble();

        System.out.println(calculateInstallmentAmount(principalAmount,
                interest,
                freq,
                tenure,
                rv));

    }
}

package seconddayassignment;

import java.util.Scanner;
import static seconddayassignment.Day1.incomeTaxCalculator;

public class Question3 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the amount");
        double amount=scanner.nextDouble();
        System.out.println("Entered amount is:- "+amount);
        System.out.printf("Tax is:- %.2f",incomeTaxCalculator(amount));

    }
}

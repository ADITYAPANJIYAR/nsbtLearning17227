package seconddayassignment;

import java.util.Scanner;

import static seconddayassignment.Day1.dbr;
import static seconddayassignment.Day1.status;

public class Question6 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter monthly expense");
        int expense=scanner.nextInt();
        System.out.println("Enter monthly income");
        int monthlyIncome=scanner.nextInt();
        double result=dbr(expense,monthlyIncome);
        status(result);

    }
}

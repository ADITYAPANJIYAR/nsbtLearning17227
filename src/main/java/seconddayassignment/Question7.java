package seconddayassignment;

import java.util.Scanner;

public class Question7 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter property value");
        double propertyValue =sc.nextDouble();

        System.out.println("Enter Loan amount asked");
        double loanAmountAsked=sc.nextDouble();

        System.out.println("LTV is:- "+ Day1.ltv(loanAmountAsked,propertyValue)+"%");
    }
}

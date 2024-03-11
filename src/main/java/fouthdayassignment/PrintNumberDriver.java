package fouthdayassignment;

import java.util.Scanner;
import static fouthdayassignment.PrintNumber.print;

public class PrintNumberDriver {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a value on integer type");
        int a= scanner.nextInt();
        System.out.println("Enter a value on float type");
        float b=scanner.nextFloat();
        System.out.println("Enter a value on double type");
        double c= scanner.nextDouble();

        print(a);
        print(b);
        print(c);

    }
}

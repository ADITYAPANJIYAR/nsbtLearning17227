package seconddayassignment;

import java.util.Scanner;

import static seconddayassignment.Day1.pascalTraingle;

public class Question5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number");
        int n= scanner.nextInt();
        pascalTraingle(n);


    }
}


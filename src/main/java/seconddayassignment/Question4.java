package seconddayassignment;

import java.util.Scanner;

public class Question4 {

    public static void main(String[] args) {
        System.out.println("Enter a positive number");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        Day1.checkNumberType(n);
    }
}

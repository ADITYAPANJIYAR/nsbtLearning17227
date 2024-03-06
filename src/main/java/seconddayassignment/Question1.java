package seconddayassignment;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        System.out.println("Enter the marks");
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();
        Day1.checkPassFail(marks);
    }
}

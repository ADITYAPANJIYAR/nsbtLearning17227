package seconddayassignment;

import java.util.Scanner;
import static seconddayassignment.Day1.printDayInWord;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the day");
        int day=sc.nextInt();
        printDayInWord(day);
    }
}

package fouthdayassignment;
import java.util.Scanner;

public class ReplaceSubstring {
    public static String replaceSubstring(String s, String s1, String s2) {
        String ans="";
        int target=s.indexOf(s1);
        if(target<0)
            return s;
        else {
            while (target>=0){
                ans=ans+s.substring(0,target);
                ans=ans.concat(s2);
                s=s.substring(target+s1.length());
                target=s.indexOf(s1);
            }
        }

        if(target<0)
            ans=ans+s;
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter string S: ");
        String s = scanner.nextLine();

        System.out.print("Enter string S1: ");
        String s1 = scanner.nextLine();

        System.out.print("Enter string S2: ");
        String s2 = scanner.nextLine();
        String modifiedString = replaceSubstring(s, s1, s2);
        System.out.println("Modified string: " + modifiedString);
    }

}

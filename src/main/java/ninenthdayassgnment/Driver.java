package ninenthdayassgnment;
import java.util.function.Predicate;

public class Driver {
    public static void main(String[] args) {
        //question1
        ConcatString concatString=(s1,s2)->s1+s2;
        String s= concatString.concat("hello","world");
        System.out.println(s);
        
//        question2
        Predicate<Integer> divisibleBy5 =number->number%5==0;
        Predicate<Integer> divisibleBy2=number->number%2==0;
//        Predicate<Integer> divisibleBy19=num->((num%5==0)&&(num%2==0)); code reuse nahi ho payega
        int num=10;
        System.out.println("Is " + num + " divisible by 5-> " + divisibleBy5.test(num));
        System.out.println("Is " + num + " divisible by 2-> " + divisibleBy2.test(num));
        System.out.println("Is " + num + " divisible by 5 and 2 " +(divisibleBy2.test(num) && divisibleBy5.test(num)));
        System.out.println("Is " + num + " divisible by 5 and 2 " +(divisibleBy2.test(num) || divisibleBy5.test(num)));

    }
}

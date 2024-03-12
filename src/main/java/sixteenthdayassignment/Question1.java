package sixteenthdayassignment;

public class Question1 {
    public static void main(String[] args) {
        DivisorClass divisorClass1=new DivisorClass();
        divisorClass1.divisorFinder(10000);
        System.out.println(divisorClass1.getMaximumDivisor());
        System.out.println(divisorClass1.getMaximum());
    }
}



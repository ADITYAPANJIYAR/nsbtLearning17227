package sixteenthdayassignment;

import java.util.concurrent.atomic.AtomicInteger;

public class DivisorClass {
    AtomicInteger maximum=new AtomicInteger(0);
    AtomicInteger maximumDivisor=new AtomicInteger(0);
   public void divisorFinder(int n){
       for (int i = 1; i <= n; i++) {
           AtomicInteger count=new AtomicInteger(0);
           for (int j = 1; j <=i ; j++) {
               if(i%j==0)
                   count.incrementAndGet();
           }
           if (count.get()>maximum.get()){
               maximum.set(count.get());
               maximumDivisor.set(i);
           }
       }
   }
   public AtomicInteger getMaximumDivisor(){
       System.out.println("Number with maximum divisor is: ");
       return maximumDivisor;
   }

    public AtomicInteger getMaximum() {
//        System.out.println("Number of divisor are: ");
        return maximum;
    }
}


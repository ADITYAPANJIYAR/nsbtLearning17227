package fourteenthdayassignment;

import eighthdayassignment.question2.customer.Customer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Question8 {
    private static final Logger log= LogManager.getLogger(Question8.class);
    public static void main(String[] args) {
        List<Customer> customerList=new ArrayList<>(2000005);
        IntStream stream1=IntStream.range(1,1000001);
        long startTime=System.nanoTime();
        stream1
                .parallel()
                .forEach(element->customerList.add(new Customer(element)));
        long endTime=System.nanoTime();
        log.info("Parallel time is: ");
        log.info(endTime-startTime);

        IntStream stream2=IntStream.range(1,1000001);
        long startTime2=System.nanoTime();
        stream2
                .forEach(element->customerList.add(new Customer(element)));
        long endTime2=System.nanoTime();
        log.info("Sequential time is: ");
        log.info(endTime2-startTime2);

    }
}

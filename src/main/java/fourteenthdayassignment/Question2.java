package fourteenthdayassignment;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Question2 {
    private static final Logger log= LogManager.getLogger(Question2.class);
    public static void main(String[] args) {
        List<Integer> integerList=new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            integerList.add(i);
        }

        Stream<Integer> stream=integerList.stream();
        int value=stream.mapToInt(Integer::intValue)
                .sum();
        log.info(value);
    }
}
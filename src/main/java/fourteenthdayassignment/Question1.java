package fourteenthdayassignment;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Question1 {
    private static final Logger log= LogManager.getLogger(Question1.class);
    public static void main(String[] args) {
        List<Integer> integerList=new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            integerList.add(i);
        }
        integerList.add(10);
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        Stream<Integer> stream=integerList.stream();
        stream.distinct()
                .forEach(log::info);
    }
}

package fourteenthdayassignment;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Question6 {
    private static final Logger log= LogManager.getLogger(Question6.class);
    public static void main(String[] args) {
        List<Integer> integerList=new ArrayList<>();
        integerList.add(10);
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(12);
        integerList.add(11);
        Stream<Integer> stream=integerList.stream();
        log.info(stream.mapToInt(Integer::intValue).max());

    }
}

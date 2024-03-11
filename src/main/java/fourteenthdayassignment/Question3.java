package fourteenthdayassignment;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Question3 {
    private static final Logger log= LogManager.getLogger(Question3.class);
    public static void main(String[] args) {
        List<Integer> integerList=new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            integerList.add(i);
        }

        Stream<Integer> stream=integerList.stream();
        stream.map(element->Math.pow(element,3))
                .filter(num->(num>50))
                .forEach(log::info);
    }
}


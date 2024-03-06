package thirteenthdayassignment;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

public class Question4 {
    private static final Logger log= LogManager.getLogger(Question4.class);
    public static void main(String[] args) {
        Map<Integer,String> integerStringMap=new HashMap<>();
        integerStringMap.put(1,"one");
        integerStringMap.put(2,"two");
        integerStringMap.put(3,"three");

        for (Map.Entry<Integer,String> element: integerStringMap.entrySet()) {
            log.info(element.getValue());
        }
    }
}

package twelvethdayassignment;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashSet;
import java.util.Set;

public class Question6 {
    private static final Logger log= LogManager.getLogger(Question6.class);
    public static void main(String[] args) {
        Set<String> fruits=new HashSet<>();
        fruits.add("Pear");
        fruits.add("Banana");
        fruits.add("Tangerine");
        fruits.add("Strawberry");
        fruits.add("Blackberry");
        for(String elements: fruits){
            log.info(elements);
        }
        log.info(fruits.size());

        fruits.remove("Blackberry");
        for(String elements: fruits){
            log.info(elements);
        }
        log.info(fruits.size());

        fruits.clear();
        log.info("After clear");
        for(String elements: fruits){
            log.info(elements);
        }
    }
}
//Fruits does not get in order because jvm is using hashmap address to store the set data.

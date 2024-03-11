package fourteenthdayassignment;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Question4 {
    private static final Logger log=LogManager.getLogger(Question4.class);
    public static void main(String[] args) {
        List<String> stringList=new ArrayList<>();
        stringList.add("english");
        stringList.add("math");
        stringList.add("physics");
        stringList.add("chemistry");

        Stream<String> stream=stringList.stream();
        stream.filter(str->str.length()>5)
                .forEach(log::info);
    }
}

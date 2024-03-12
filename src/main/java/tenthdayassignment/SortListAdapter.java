package tenthdayassignment;

import java.util.ArrayList;
import java.util.List;

public class SortListAdapter {
    public int[] sort(int[] numbers){
        List<Integer> numberList=new ArrayList<>(numbers.length);
        for(int num : numbers){
            numberList.add(num);
        }
        NumberSorter sorter = new NumberSorter();
        numberList = sorter.sort(numberList);
        for(int i=0; i<numbers.length; i++){
            numbers[i]=numberList.get(i);
        }
        return numbers;
    }
}
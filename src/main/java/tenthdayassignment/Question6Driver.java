package tenthdayassignment;

public class Question6Driver {
    public static void main(String[] args) {
        int[] numArray={23,54,12,33,1,97};
        SortListAdapter obj=new SortListAdapter();
        numArray=obj.sort(numArray);
        for(int i=0; i<numArray.length; i++){
            System.out.println(numArray[i]);
        }
    }
}

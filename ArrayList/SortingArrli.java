package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortingArrli {
    public static void main(String[] args) {
           ArrayList<Integer> list= new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(8);
        list.add(4);
        list.add(4);
        System.out.println("****Before Sorting***");
        System.out.println(list);
        System.out.println("****After Sorting***");
        Collections.sort(list);// it will sort in Ascending!
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());//it will sort in descending!
        System.out.println(list);


        
    }
}

package ArrayList;
import java.util.*;
public class PrintMax_val {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(18);
        list.add(3);
        list.add(4);
        list.add(15);
        list.add(8);
        list.add(4);
        list.add(114);
        System.out.println(list);
        //let maxValue=-infinite! i.e
        int maxValue=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            if(maxValue<list.get(i)){
                maxValue=list.get(i);
            }
        }
        System.out.println("Max value in an ArrayList:"+maxValue);

        //Find Min_Value in an ArrayList!
        int minValue=Integer.MAX_VALUE;
        for(int i=0;i<list.size();i++){
            // if(minValue>list.get(i)){
            //     minValue=list.get(i);
            // }
            minValue=Math.min(minValue, list.get(i));
        }
        System.out.println("MIN value in an ArrayList:"+minValue);


    }
}

package ArrayList;
import java.util.ArrayList;
public class MultiDim {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList= new ArrayList<>();
        ArrayList<Integer> list1= new ArrayList<>();
        ArrayList<Integer> list2= new ArrayList<>();
        ArrayList<Integer> list3= new ArrayList<>();
        // list1.add(0); 
        // list1.add(1);
        // list1.add(2);
        // list1.add(3);
        
        // list1.add(4);
        // list1.add(5);
       for(int i=0;i<=5;i++){
        list1.add(i*1);
        list2.add(i*2);
        list3.add(i*3);
    }
    mainList.add(list1);
    mainList.add(list2);
    mainList.add(list3);
    System.out.println(mainList);
        
       
    }
}

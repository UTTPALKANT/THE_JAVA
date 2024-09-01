package ArrayList;

import java.util.ArrayList;

public class SwapTwoNum {
    //Function to swaping two number!
    public static void swapNum(ArrayList<Integer> list, int index1,int index2){
        int temp=list.get(index1);
        list.set(index1,list.get(index2));
        list.set(index2, temp);
       // System.out.println(list);

    }
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
        int index1=1,index2=3;


        System.out.println("*******Before Swap***");
        System.out.println(list);
        System.out.println("***Aferter Swaping***");
        swapNum(list,index1,index2);
        System.out.println(list);
    }
}

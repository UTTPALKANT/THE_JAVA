package ArrayList;
import java.util.ArrayList;
public class OperationPrac {
    public static void main(String[] args) {
        ArrayList<Integer> list1 =new ArrayList<>();
        //Add operation
        list1.add(5);
        list1.add(6);
        list1.add(1,2);
        list1.set(1,9);//previous element at index 1 get remove!
        list1.add(1,3);//previous element at index 1 get switch to next index!
        list1.add(12);// 12 will going to add at last index! by default!

        System.out.println(list1);
       
        //Remove operation
        System.out.println("*******After remove*****");
        list1.remove(1);
        System.out.println(list1);
        //get Element
        list1.get(2);//not work
       // System.out.println(list1);
       System.out.println(list1.get(2));//work

       System.out.println(list1.contains(4));//return false!;
       System.out.println(list1.contains(6));//return true!;

    }
}

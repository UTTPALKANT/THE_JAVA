package ArrayList;
import java.util.ArrayList;
public class Swap {
    public static void main(String[] args) {
        ArrayList<Integer> n=new ArrayList();
        int arr2[]=new int[4];
        int arr3[]={1,5,7,8,3,9};
        n.add(1);n.add(5);n.add(4);n.add(4);n.add(2);n.add(9);
        // arr.add() //cann't use add method!
        
        System.out.println("An ArrayList! " +n);
        System.out.println("Size of an ArrayList! "+n.size());
        System.out.println("Size of an array2 is! "+arr2.length);
        System.out.println("Size of an array3 is! "+arr3.length);


        // Swaping in ArrayList!!  without loop! and without using third varialbe
        int a= n.get(0);
        int b= n.get(5);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swap we get!!"+a +" and "+b);
        n.set(0, a);
        n.set(5, b);
        System.out.println("New ArrayList is!!"+n);
        
    }
}

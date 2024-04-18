package ArrayList;
import java.util.ArrayList;
public class Swap1 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList();
        list.add(2);
        list.add(9);
        list.add(8);
        list.add(3);
        list.add(1);
        list.add(5);
        int indx1=0;
        //int indx2=list.size()-1; //or
        int indx2=5;
        System.out.println(list);
        int temp =list.get(indx1);
        list.set(indx1, list.get(indx2));
        list.set(indx2, temp);
        System.out.println(list+"New list! ");
    }
}

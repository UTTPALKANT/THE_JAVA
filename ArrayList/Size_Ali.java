package ArrayList;
import java.util.ArrayList;
public class Size_Ali {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(8);
        list.add(4);
        list.add(4);
        System.out.println("Size of an arrylist:"+list.size());
        System.out.print("Element of arrayList:");
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        System.out.println(list);

    }
}

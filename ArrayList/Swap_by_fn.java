package ArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
public class Swap_by_fn {

    //function of two element of Swaping in ArrayList !
    public static void swap(ArrayList<Integer> list,int index1,int index2){
        int temp=list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
        System.out.println(list+" is new ArrayList");
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList();
        list.add(2);
        list.add(9);
        list.add(8);
        list.add(3);
        list.add(1);
        list.add(5);
        int index1=1;
        int index2=list.size()-1;// or take any index value! like 1 or 5 but within 
        System.out.println(list+"is original ArrayList!");
        swap(list, index1, index2);

        list.set(0, 10);
        list.remove(4);
       // list.clear();  it will remove all element of ArrayList! empty will print i.e [];
       list.clone();
       System.out.println(list);
       Collections.sort(list);
       System.out.println(list+":is Sorted ArrayList");

       //for normal arr
       int arr[]={4,8,5,0,8,0,1};
       for(int i=0;i<arr.length;i++){
           Arrays.sort(arr);

           System.out.print(arr[i]+" ");
       }
    //    System.out.println("");
           System.out.println(": is normal array in sorted");
           Collections.sort(list,Collections.reverseOrder());
           // reverOrder() is a Comparitable Function! logic
           System.out.println(list+":sorted in discending order");
       }
}

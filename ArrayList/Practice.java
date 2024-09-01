package ArrayList;
import java.util.ArrayList;
import java.util.Collections;
public class Practice {
    public static void main(String[] args) {
        ArrayList<Integer> list1= new ArrayList();
        String str= "Uttpal Kant";
        list1.add((1));
        list1.add((18));
        list1.add(5);
        list1.add(2);
        list1.add(8);
        list1.add(9);

        //list1.add("");//add is not applicable for String argument!
        
        
        System.out.println("ArrayList:"+list1);
        System.out.println("ArrayList:"+list1+str);
        System.out.println("size of ArrayList:"+list1.size( ));
        // to reverse the arrlist!!
        for(int i=list1.size()-1;i>=0;i--){
            int newList1= list1.get(i);
            System.out.print(newList1);
        }
        System.out.println();
        // to find max value in ArrayList!
        int max=Integer.MIN_VALUE;
        for(int i=0;i<list1.size();i++){
            int element=list1.get(i);
            if(max<element){
                int temp=max;
                max=element;
                
            }
            
        }
        System.out.println("Max element in an ArrayList is:"+max);
        //Swap two number!
        int a=list1.get(5);// at index5th 9 is placed!
        int b=list1.get(2);// at index 2th 5 value is palced!
        //swaping 
        System.out.println("before swaping! a and b ="+a+ " and "+b);//9 and 5
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swaping! a and b ="+a+ " and "+b);// 5 and 9

        System.out.println();
        //sorting list1; or ArrayList! let do it by selection sort!
        System.out.println("unsorted ArrayList is:"+list1);

        Collections.sort(list1);
        System.out.println("sorted ArrayList is:"+list1);

        }
    
}

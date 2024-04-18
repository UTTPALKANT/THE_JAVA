package ArrayList;
import java.util.ArrayList;
public class ReverseList {
    public static void main(String[] args) {
        ArrayList<Integer> num=new ArrayList<>();
        num.add(4);num.add(1);
        num.add(5);
        num.add(8);
        System.out.println(num+"-->this is ArrayList");
        System.out.println(" size of ArrayList!"+num.size());// to find size of arrayList!
        
        // Reverse of ArrayList Element!
        for(int i=num.size()-1;i>=0;i--){
            System.out.print(num.get(i)+" ");
            
        }     
    }
}

package ArrayList;
import java.util.ArrayList;
public class Method_ {
    public static void main(String[] args) {
        //to find max number in an ArrayList!
        ArrayList<Integer> n= new ArrayList();
        n.add(5);  n.add(88); n.add(2);   n.add(8);   n.add(3);   n.add(10);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n.size();i++){  // .size() method to find length of ArrayList!
            // if(n.get(i)>max){
            //     max=n.get(i);
            // }
            max= Math.max(max, n.get(i));  // by using math Class!
        }
        System.out.println(max+" is your max value");
    }
}

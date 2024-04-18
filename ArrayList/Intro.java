package ArrayList;
import java.util.ArrayList;
public class Intro{
    public static void main(String[] args) {
        ArrayList<Integer> str= new ArrayList<>();
        ArrayList<Integer> str1= new ArrayList<>();

    str.add(4);
    str.add(1);
    str.add(2, 5);
    str1.add(4);
    System.out.println("define ArrayList is"+str);
    System.out.println("define ArrayList is"+str1);
   System.out.println("index value is:"+ str.get(2));
   System.out.println("is contain:"+ str1.contains(1));
   System.out.println("size of defined ArrayList is:"+str.size());

   System.out.print("print element of Arraylist::");

   for(int i=0;i<str.size();i++){
    System.out.print(str.get(i)+" ");
   }
   
    }
}
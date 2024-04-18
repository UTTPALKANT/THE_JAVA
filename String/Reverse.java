package String;
import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("Uttpal");
        StringBuffer str1=new StringBuffer("Vikas");
        String str2=new String("Maam");
        System.out.println(str);
        str.append('s');
        str.append('r');
        str.append("t");
        str.append(5);
        str.append('@');
        System.out.println(str);
        //System.out.println(str.reverse());
       // System.out.println(str.append(str1).append(str2));
        //System.out.println(str2+str.append(str+str2));
    }
}

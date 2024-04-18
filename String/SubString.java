package String;
import java.util.*;

public class SubString {
    public static String isSubstring(String ss, int starting, int ending){
        for(int i=starting;i<ending;i++){
            ss +=ss.charAt(i);
        }
        return ss;

    }
    public static void main(String[] args) {
        // String s="Uttpal Kant";
        // System.out.println("here is your substring: "+s.substring(1,5));

        // // print sub string via taking input from user
        // Scanner sc=new Scanner(System.in );
        // System.out.println("Enter your String value:");
        // String s1=sc.nextLine();  //keep rember that is here L is captal letter not small letter other vise compile error
        // System.out.print("("+"\""+s1.substring(2,5)+"\""+")"+" it's your substring");


        // via declare function

        String ss= "uttpalkant@chandu:no";
        System.out.print(isSubstring(ss, 2, 8));
      
    }
}

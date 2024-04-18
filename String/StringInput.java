package String;
import java.util.*;
public class StringInput{
    public static void main (String args[]){
       Scanner sc=new Scanner(System.in);
    //     System.out.println("Enter your value");
    // //    String Name= sc.next();//only print single String or single word when we put input
    // //    String nname =sc.nextLine();// it is not case sensitive nextline() is used to print full or complete sentence 
    // //    //System.out.print(Name);
    // //    System.out.print(nname);

    //    String namee;
    //    //namee="Uttpal Kant";System.out.print(namee);
    //    //namee =sc.next();
    //     namee =sc.nextLine();
    //    System.out.println("Enter value :"+ "\""+namee +"\"");   // inside the " " put \" to print "uttpal" as it is!
    //    System.out.println("Size " +namee.length()); // it include space also then complete count !
       



       // concatenation of String
       String myName;
       System.out.println("Enter Your Name");
        myName=sc.nextLine();
       String villa;
       System.out.println("Enter your villa");
       villa =sc.nextLine();
      String Address = myName+" "+ villa;
      System.out.println("Your Address is: "+Address);

      

    }

}
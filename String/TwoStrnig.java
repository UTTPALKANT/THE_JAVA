package String;

//wap to print append of two String without using any operator in java
//wAP TO PRINT LOWER CASE INTO UPPER CASE!
// wap to print vowel it number of vowel!


public class TwoStrnig {
    public static void main(String[] args) {
        String st1="Uttpal";
        String st2 = "kant";
        String s="i am uttpal kant";
        String s1=s.toUpperCase();
        System.out.println(s1);
      
        // StringBuilder st3= new StringBuilder();
        // st3.append(st1).append(st2);
        // System.out.println(st3);

        st1 = st1.concat(st2);
        System.out.println(st1);

        
    }
}

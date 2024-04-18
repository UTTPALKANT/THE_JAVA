package Backtracking;

public class PprintSubset {
    //WAF to print subset!
    public static void printSubset(String str,int i,String total_sub){
        //Base Case!
        if(i == str.length()){
            if(total_sub.length() == 0){
                System.out.println("null");
            }
            else{
                System.out.println(total_sub);
            }
            return;
        }
        //recusion 
        printSubset(str, i+1, total_sub+str.charAt(i));

        printSubset(str, i+1, total_sub);
       
    }

    //practice
    //WAF to print subset!
    public static void subset(String strr, int i, String subset){
        //b..case!
        if(i == strr.length()){
           if(subset.length() == 0){
            System.out.println("null");
           }
           else{
            System.out.println(subset);
           }
           return;
        }
        //recursion!
        subset(strr, i+1, subset+strr.charAt(i)); // recursivly calling! in case of yes(option to be part of subset)!
        subset(strr,i+1,subset);// in case of not part of subset !

    }
    public static void main(String[] args) {
       // String str ="uttpal";
     //   printSubset(str, 0, "");
        String strr ="abc8";
        subset(strr, 0, "");
    }
}


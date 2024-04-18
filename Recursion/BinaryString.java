package Recursion;

public class BinaryString {
    //function to print Binary String without consicutive one's!
    public static void printBinaryString(int n,int lastPlace, String str){
        //Base case!
        if(n == 0){
            System.out.println(str);
            return;
        }
        //kaam!
        printBinaryString(n-1, 0, str+"0");
        if(lastPlace == 0){
            printBinaryString(n-1,1,str+"1");
        }
    } 
    public static void main(String[] args) {
        printBinaryString(3, 0, "");
        
    }
}

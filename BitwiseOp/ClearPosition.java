package BitwiseOp;

import java.util.Scanner;

public class ClearPosition {
    
    //function 
    public static int toClear_ith_index(int n,int i){
        int bitMask=1<<i;
        return (n & ~(bitMask));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number ");
        int n=sc.nextInt();
        System.out.print("Which index value enna clear? ");
        int i=sc.nextInt();
        System.out.print("at "+i+" index of "+n+ " has cleared: "+ toClear_ith_index(n,i)+" is output as decimal value");
    }
}

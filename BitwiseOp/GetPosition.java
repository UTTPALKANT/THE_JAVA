package BitwiseOp;

import java.util.Scanner;

public class GetPosition {
    //function to Get ith position
    public static int getpostion_value(int n,int i){
       
        
        int bitMask=1<<i;
        if((n &bitMask) == 0){
           return 0;

        }
        else{
            return 1;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number:");
       int  n= sc.nextInt();
        System.out.print("Enter your position:");
         int i=sc.nextInt();
         
         System.out.println("at index "+ i + " is :"+getpostion_value(n, i));
       
    }
}

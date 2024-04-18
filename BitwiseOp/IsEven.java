package BitwiseOp;

import java.util.Scanner;

public class IsEven {
    
    public static void  main(String[] args) {
        Scanner sc =new Scanner(System .in);
        System.out.print("enter your number:");
        int n =sc.nextInt();
        int bitMask = 1;
        if((n & bitMask) ==0){
           System.out.println("nunber is even");
        }
        else{
           System.out.println("number is odd");
        }
        
    }
}

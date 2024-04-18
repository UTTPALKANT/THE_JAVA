package BitwiseOp;

import java.util.Scanner;

public class UpdatePosition {
    //function
    public static int updatedValue(int n,int i,int operation){
        int bitMask=1<<i;
        
        if(operation== 1){
            return (n & bitMask);

        }
        else{
            return (n | ~(bitMask));
        }

    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your number to perform");
        int n =sc.nextInt();
        System.out.print("Enter your index value");
        int i=sc.nextInt();
        System.out.println("Enter your operatiion toSet or toclear ");
        int operation=sc.nextInt();
        //  now call function
        System.out.println(updatedValue(n,i,operation));
    }
}

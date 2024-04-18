package BitwiseOp;

import java.util.Scanner;

public class SetPosition {
    //function
    public static int set_at_index(int n,int i){
        int bitMask=1<<i;
        return ((bitMask | n));
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter your number and podition/index value:");
        int n=sc.nextInt();
        int i=sc.nextInt();
        System.out.print("After seting at " +i+" position we have:"+set_at_index(n,i)+"as decimal value");
    }
}

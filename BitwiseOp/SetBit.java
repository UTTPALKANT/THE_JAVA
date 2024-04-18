package BitwiseOp;

import java.util.Set;

public class SetBit {
    //function
    public static int setElementa(int n,int i){
        int bitMask= 1<<i;
        return n|bitMask;
    }
    public static void main(String[] args) {
        int n=10;
     System.out.println( setElementa(10 , 2));
    }
}

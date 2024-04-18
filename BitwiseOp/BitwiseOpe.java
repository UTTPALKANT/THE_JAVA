package BitwiseOp;

public class BitwiseOpe {
    public static void main(String args[]){
        int n=5;
        int m=6;
        // int and= n&m;
        System.out.println( m&n );//bitwise AND
        System.out.println( n|m);//bitwise OR
        System.out.println(~n);//bitwise one's complement but it is wrong way
        System.out.println(~m);//bitwise  one's complement but it is wrong way
        System.out.println(~0); // -1 
        System.out.println(m^n);//bitwise XOR!
        
        //bitwise one's Completement
        System.out.println(~1);

        // binary left Shift and right shift
        System.out.println(5<<2);
        System.out.println(5>>2);
        
    }
}

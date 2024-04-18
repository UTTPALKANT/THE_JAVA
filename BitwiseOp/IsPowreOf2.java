package BitwiseOp;

public class IsPowreOf2 {
    //function
    public static boolean isPowerOfTwo(int n){
       return  (n & (n-1)) == 0; //define the power of two

    }
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(0));
        System.out.println(isPowerOfTwo(1));
        System.out.println(isPowerOfTwo(10));
        System.out.println(isPowerOfTwo(16));
    }
}

//expected output t,t,f , true

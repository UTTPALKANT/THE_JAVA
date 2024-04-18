package BitwiseOp;

public class Get_ith_val {
    public static int getvalue(int n,int i){
        int bitMask = 1<<i;
        if( (n & bitMask) == 0){
            return 0;
        }
        else{
            return 1;
        }
    }
    
    public static void main(String[] args) {
        int n=10;
      System.out.println( getvalue(10,3));
        

    }
}

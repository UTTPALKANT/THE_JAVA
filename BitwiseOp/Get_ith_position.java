package BitwiseOp;

public class Get_ith_position {
    public static int getPosition(int n,int i){
        int bitMask=(1<<i);// it is main logic
        if((n & bitMask)==0){
            return 0;

        }
        else{
            return 1;
        }


    }
    public static void main(String[] args) {
        int n=11;
        int i=2;
        System.out.println(getPosition( n, i));
    }
}

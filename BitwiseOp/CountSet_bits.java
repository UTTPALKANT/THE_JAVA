package BitwiseOp;

public class CountSet_bits {
    public static int  coutSetBits(int n){
        // for(int count=0;count<0;count++){
        //     if((n&1)!=0){
        //        n= n>>1;
        //     }
        //     return count;
        // }
        // return coutSetBits(n);
        int count =0;
        while(n>0){
                if((n & 1)!= 0){// line 14 checking LSB
                    count++;
                }
                n=n>>1;
            }
            return count;
    }
    public static void main(String[] args) {
        System.out.println(coutSetBits(15));
    }
}

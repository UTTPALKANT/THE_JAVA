package BitwiseOp;

public class onesComplement {
    public static void main(String[] args) {
        System.out.println(~8);
        // check number is odd or even
        int n=5;
        int bitMask =1;
        if((n & bitMask)== 0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
    
}

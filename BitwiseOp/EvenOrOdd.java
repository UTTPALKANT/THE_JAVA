package BitwiseOp;

public class EvenOrOdd {
    
    //function
    public static void isEven(int n){
        int bitmask =1;
        if((n & bitmask )== 0){
            System.out.println("Your number is even");
        }
        else{
            System.out.println("Your number is odd");
        }
    }
    public static void main (String args[]){
        int n =11;
    isEven(n);
    }
}

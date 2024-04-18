package Recursion;
//Qs. to print number in increasing order  N to 1!
//here base case is 1!

public class Print_N_Incre {
    public static void prtInce(int n){
        //base case
        if(n == 1){
            System.out.print(" "+1);
            return ;
        }
        prtInce(n-1 );
        System.out.print(" "+n);
    }
    public static void main(String[] args) {
        int n =5;
        prtInce(n);
    }
    
}

package Recursion;

import Practice.recu;

public class Fibonacii {
    //function to find fibonacci Number
    public static int fibN(int n){
        //base case 0 as well as 1!
        if(n == 0 || n==1){
            return n;
        }
        // else if{
        //     return 1;
        // }
        // fibonacci of n= fib(n-1)+fib(n-2)!
        int fibNM1 = fibN(n-1);
        int fibNM2 =fibN(n-2);
        int fibn = fibNM1+fibNM2;
        return fibn;



    }
    public static void main(String[] args) {
        int n=3;// if we analyse the observ that if n=26   ....then output will be exponentially increase
        System.out.println("fibonacci of "+n+" is :"+fibN(n));
        //let call different value
        System.out.println(fibN(26));
        System.out.println(fibN(27));
        System.out.println(fibN(28));
        System.out.println(fibN(29));
        System.out.println(fibN(30));
        System.out.println(fibN(31));
    }

}

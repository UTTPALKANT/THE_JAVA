package Recursion;

import java.util.Scanner;

public class GetPower {
    // WAF to get power of number!
    public static int getpowerof(int x,int n){
        //Base Case!
        if( n==0){
            return 1;
        }
        //Resursion
        // int pNM1=getpowerof(x,n-1);
        // int pxn=x*pNM1;
        // return pxn;

        return x*getpowerof(x,n-1);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your Base(x) value and exponential(n) value:");
        int x =sc.nextInt();
        int n =sc.nextInt();
        System.out.println("power of Base ("+x+")^"+n+" is:"+getpowerof(x,n));

    }
}

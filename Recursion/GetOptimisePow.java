package Recursion;

public class GetOptimisePow {
    //Defiine function to getoptimise power!
    public static int getOptiPow(int x,int n){
        //base case!
        if(n==0){
            return 1;
        }
        // if n (power is an even)!
        int halfPow=getOptiPow(x,n/2)*getOptiPow(x, n/2);
        //return halfPow; this line not use here i.e return yaha nahi use hoga!


        // in case of Even power!
        if(n%2!=0){
            halfPow=x*halfPow;
        } 
        return halfPow;
    }
    public static void main(String[] args) {
        int x=2;
        int n=3;
        System.out.println(getOptiPow(x, n));
    }
}

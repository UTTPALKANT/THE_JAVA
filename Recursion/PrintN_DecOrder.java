package Recursion;

import java.util.Scanner;

public class PrintN_DecOrder {
    // recursion approch!
    public static void printDecNum(int n){
        if(n == 1){//it define base case i.e smallest instance of similar problem
            System.out.println(n+" are Decreasing order of entered number");
            return ;
        }
        System.out.print(n+" ");// this line print your actual number
        printDecNum(n-1);// and it recurvively call n-1,n-2 ...... till base case
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your any  valid number");
        int n=sc.nextInt();
        printDecNum(n);

    } 
}

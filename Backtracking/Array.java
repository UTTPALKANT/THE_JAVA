package Backtracking;

public class Array {
   //waf to print actual ...final.. array value!!
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    // WAF for recursion!!
    public static void changingArr(int arr[],int i, int val){
        //Base Case!!
        if(i == arr.length){
            printArr(arr);
            return;
           // System.out.println(printArr(arr));
        }
        //Recursion (kaam)!!
        arr[i]= val;
        changingArr(arr,i+1,val+1);// this line for recursivlly filling the array index!
        arr[i]= arr[i]-2; // this line mean that after complete fill up it get backtrack and i value will decreaseing by 2!
    }
   
    public static void main(String[] args) {
        int arr[]=new int[10];
        changingArr(arr,0,1);
        printArr(arr);

    }
}

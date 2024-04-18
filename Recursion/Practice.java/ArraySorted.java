// package Recursion.Practice.java;

public class ArraySorted {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,};
        for(int i=0;i<arr.length;i++){
        if(arr[i]>arr[i+1]){
            
            System.out.println("not sorted");
        }
        else{
            System.out.println("an array is sorted");
        }
    }
}
}

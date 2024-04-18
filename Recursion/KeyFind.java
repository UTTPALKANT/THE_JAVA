package Recursion;
// WAF to find the key in an array! first occurance of key!
//WAF to find last occurance of key element!
import java.util.Scanner;

import Practice.recu;

public class KeyFind {
    //Function 
    public static int firstOccurance(int arr[],int key,int i){
        //Base case
        if(i == arr.length){
            return -1;
        }
        //recursion
        if(arr[i]==key){
          return i; // if wanna print key then at i use key!
          
           // System.out.print( "Key element  is found at index "+i);// we can also use this 

        }
        return  firstOccurance(arr, key,i+1);
      // System.out.println( "Key element "+key+" is found at index "+i); //here can't use this statement because in main fun int data type used

    }

    //last occurance of key!
    public static int lastOccu(int arr[],int key,int i){
        //Base Case 
        if(i == arr.length-1){
            return -1;
        }
        // Recursion
       int isFound= lastOccu(arr,key,i+1);
       if(isFound == -1 && arr[i] == key){
        return i;
       }
       return isFound;
    }
    public static void main(String args[]){
        int arr[]={8,3,6,9,5,10,2,5,3};
        // Scanner sc= new Scanner(System.in);
        // System.out.print("Enter your key element");
        //int key =sc.nextInt();
    System.out.println(firstOccurance(arr,5,0));
       //5 int key=5;
        System.out.println(lastOccu(arr, 5, 0));

    }
}

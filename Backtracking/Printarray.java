package Backtracking;

public class Printarray {
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    //recursion function!!
    public static void changingArr(int arr[],int si, int val){  // take val to fill empty arr!
        //Base case!
        if(si == arr.length-1){
            printArr(arr);
            return;
        }
        //Recursion!!
         arr[si] =val;
         changingArr(arr, si+1, val+1);//recursivly calling till then complete of equal to size of arr!
         arr[si]=arr[si]-2; // backtracking!
        
    }
    public static void main(String[] args) {
        int arr[]=new int[5];
        changingArr(arr, 0, 1);
        printArr(arr);

    }
    
}

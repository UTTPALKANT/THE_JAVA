package Array;

import java.util.Arrays;

public class SortOneZero {
    
    
    public static void SortOneZero (int[] arr)
    {
        int left=0,right=arr.length-1,temp;
        while (left<right) {
            if(arr[left] == 1){
                if(arr[right] != 1){
                temp =arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
            }
            right--;
        }else
        left++;
    }
    }
    public static void main(String[] args) {
        int[] arr =  {1,0,0,0,1,0,1,0,1,1,0};
        //int[] arr =  {1,0,1,1,1,0,1};
        SortOneZero(arr);
        System.out.println(Arrays.toString(arr));
    }
}

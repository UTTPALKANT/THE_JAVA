package Array;

import java.util.Arrays;

public class Sort012 {
    public static void sort012(int[] arr)
    {
        int left=0,right=arr.length-1,temp,curr=0;
        while (curr <=right) {
            if(arr[curr] == 0){
                temp = arr[left];
                arr[left] = arr[curr];
                arr[curr]=temp;
                left++;
                curr++;
            }
            else if(arr[curr] == 2){
                temp = arr[right];
                arr[right] = arr[curr];
                arr[curr]=temp;
                right--; 
            }else
            curr++;
            
        }

    }
    public static void main(String[] args) {
        int[] arr= {1,0,2,1,2,0,1,0,2,2,1,0,2,0,1};
        sort012(arr);
        System.out.println(Arrays.toString(arr));
    }
}

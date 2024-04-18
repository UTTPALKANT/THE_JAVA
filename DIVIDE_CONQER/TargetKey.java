import Practice.recu;

public class TargetKey {
    public static int search_key(int arr[],int target_key,int si,int ei){      // Function to call recursive!
        if(si>ei){ //base case!
            return -1; // that mean invalid input!
        }
        //kaam i.e logic!
        int mid = si+(ei-si)/2; // to get mid element! 
        if (arr[mid] == target_key){// Case FOUND!
            return mid;
        }
        if (arr[si]<= arr[mid]){        // mid on line 1! /case a:
            if(arr[si]<= target_key && target_key<=arr[mid]){    //left
                return search_key(arr, target_key, si, mid - 1);
            }
            else{
                return search_key(arr, target_key,mid+1,ei);     // case b: right!
            }
        }

        else{       // Mid On Line 2!
            if(arr[mid]<= target_key && target_key <=arr[ei]){    //case c: right!
            return search_key(arr, target_key, mid+1, ei);
        }
            else{
                return search_key(arr, target_key, si,mid-1);  // case d: left
            }
        }
    }
    
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int target_key=0;
        // int found_key = search_key(arr, target_key, 0,arr.length-1);
        // System.out.println(found_key);
        System.out.println(search_key(arr, target_key, 0,arr.length-1));
    }
    
}

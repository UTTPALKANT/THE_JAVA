public class Search_key {
    //function for recursively calliing!
    public static int searching_key(int arr[],int si ,int tar,int ei){
        // Base case!
        if(si> ei){
            return -1; // return -1 for invalid input!
        }
        //logic!
        int  mid= si + (ei-si)/2; //-> to get mid                       //or we can also use (si+ei)/2;
        if(tar == arr[mid]){
            return mid;
        }
        if( arr[si] <=arr[mid]){
          if( tar >=si && tar<=arr[mid]){ // for line 1st  || on left side!
            
              return searching_key(arr, tar,si,mid-1);
            }
             else{
            return searching_key(arr,tar,mid+1,ei);
            }
        }
        if( tar>=si && tar>=arr[mid]){
            return searching_key(arr, mid+1, tar, ei);
        }
        else{
            return searching_key(arr, 0, tar, mid-1);
        }

    }
    public static void main(String[] args) {
        int arr[]= {4,5,6,7,0,1,2,3};
        int tar= 0;
        System.out.print("target key value is at index "+ searching_key(arr, 0, tar,arr.length-1));

    }
}

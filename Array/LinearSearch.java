package Array;

public class LinearSearch {
    public static int linearSearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(key == arr[i]){
                // System.out.println(arr[i]+" at index "+i);
                // break;
                return i;
            }
        }
        return -1;
    }
    // linear searching for name:
    public static int getName(String str[], String name){
        for(int i=0;i<str.length;i++){
            if(name == str[i])
            return i;
        }
        return-1;
    }
    public static void main(String[] args) {
        int arr[]={5,8,6,8,9,3,7,2};
        // String str[]= {"Uttpal","Vikas ", "Vinay"};
        // String name="Pandey";                         // H/W
        int key=8;     
       int ans =linearSearch(arr, 54) ;
       if( ans == -1){
        System.out.println("key not found! :");
       }
       else{
        System.out.println("  key is at index "+ans+", key element is:"+key);
       }
    }
}

public class QuickSort{
    // function to print an Array!
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    //function for Recursive calling!
    public static void quickSort(int arr[],int si,int ei){
        //Base Case!
        if(si>=ei){
            return;
        }

        //logic build--->
        // variable to select pivot!
        int p_index =partition(arr,si,ei);
        // recursive call for left partion!
        quickSort(arr,si,p_index-1);
         // recursive call for rigth partion!
        quickSort(arr,  p_index+1,ei);
    }
    // function for what is going iniside the partition!
    public static int partition(int arr[],int si,int ei){
        int pivot =arr[ei];
        int i =si-1;// this line is used to make the empty space to store the element!!
        for(int j=si;j<ei;j++ ){
            if(arr[j]<=pivot){
                i++;

                // swap 
                int temp =arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
            
        } 
        // for vise-versa!!
        i++;
        int temp =pivot;
        arr[ei] =arr[i];
        arr[i]=temp;
        return i;
    }

    public static void main(String[] args) {
        int arr[]={1,5,2,-8,8,0,1,8,3,9};
        quickSort(arr, 0,arr.length-1);
        printArr(arr);
    }
}
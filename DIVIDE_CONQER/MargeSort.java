//package DIVIDE_CONQER;

public class MargeSort {
    public static void printArray(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static void mergeSort(int array[],int si,int ei){
        //base case!
        if(si>=ei){
            return ;
        }
        //kaam i.e logic!
        int mid = si+(ei-si)/2;// mid find out! //or-> mid= (si+ei)/2;
        mergeSort( array,si,mid);// left part!
        mergeSort(array,mid+1,ei);// rightb part!
        merge(array, si, mid, ei);
    }

    // Write an other function to merge left and right sorted  part !
    public static void merge(int array[],int si,int mid,int ei){
        int temp[]=new int[ei-si+1];//take a temporary variable to store the partially sorted array!
       // int temp[]=new int[si+ei]; //can't!
        int i = si;// iterator for first sorted array
        int j = mid+1; // iterator for 2nd sorted array!
        int k =0; //iterator for temp !

        while(i <=mid && j<=ei){
            if(array[i] <array[j]){
                temp[k] = array[i];//store in temp variable!
                i++;
            }
            else{
                temp[k] = array[j];
                j++;

            }
            k++;
        }
        // left part
        while(i<=mid){
            temp[k++]=array[i++];

        }
        //right part
        while(j<=ei){
            temp[k++]=array[j++];
        }
        //copy temp variable to original variable!
        for(k =0,i=si;k<temp.length;k++,i++){
            array[i] = temp[k];
        }
    }

    public static void main(String[] args) {
    int array[]={2,5,4,3,-8,6,-1,2};
    mergeSort(array, 0, array.length-1);
    printArray(array);
}
    
}

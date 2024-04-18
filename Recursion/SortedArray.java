package Recursion;
// Problem for sorted array!


public class SortedArray {
   //funtion
    public static boolean isSorted(int arr[],int i){        // i is use for index scanning
        //Base case
        if( i == arr.length-1){
            return true;
        }
        //implementation

        if(arr[i]>arr[i+1]){  // this initially checking
            return false;
        }
        // now recursivelly call for next
        return isSorted(arr,i+1);    // this line compare element and next element of array!
    }
    public static void main (String args[]){
        int arr[]={1,(int)1.99,3,(int)4.999999,5,7,8,9};  //here we use type casting
        System.out.print(isSorted(arr,0));// arr to hoga hi but 0 isliye kyu ki starting mai 0 s start karenge comparision
    }
}


/* 1. Type Casting: In typing casting, a data type is converted into another data type by the programmer using the casting operator during the program design. In typing casting, the destination data type may be smaller than the source data type when converting the data type to another data type, that’s why it is also called narrowing conversion. 

Syntax/Declaration:-

destination_datatype = (target_datatype)variable;


(): is a casting operator. */


/*2. Type conversion : In type conversion, a data type is automatically converted into another data type by a compiler at the compiler time. In type conversion, the destination data type cannot be smaller than the source data type, that’s why it is also called widening conversion. One more important thing is that it can only be applied to compatible data types. 

Type Conversion example –

int x=30;
float y;
y=x;  // y==30.000000.*/

import java.util.Scanner;

public class Recursion {
    // function to print number N to 1 in decreasing order! 5,4,3,2,1
     public static void print_n_dec(int n){
        //Base Case!
        if(n == 1){
           System.out.print(n);
           return;
        }
        System.out.print(n+" ");
        print_n_dec(n-1);
       
     }
     //function to print n natural number in increasing order!
     public static int  print_n_incre(int n){
        //base case!
        if(n==1){
           System.out.print(" "+1);
           return 1;
        }
        //kaam!
    
         print_n_incre(n-1);
        System.out.print(" "+n);
        return n;
     }
     
     // write a function to print factorial of n  natural number!
      public static int  print_n_fact (int n){
            //Base Case!
            if(n ==0 || n==1){
                 return 1;
            }
            //kaam ya logic!!
            // let mean asssume that n minus 1 ka factorial calculated via recursion!!
            int fnm1 =print_n_fact(n-1);
            int fn =n*fnm1;
            return fn;

      }

      // WAF to print sum of n natural number!
      public static int print_sum(int n){
        //base case!
        if(n==0 || n==1){
            return n;
        }
        //logic!
       
        return n+print_sum(n-1);
      }
      //WAF to print fabonacci number!
      public static int print_fab(int n){
        //Base Case!
        if(n==0 || n==1){
            return n;
        }
        //logic!
        int fnm1=print_fab(n-1);
        int fnm2=print_fab(n-2);
        int fn= fnm1+fnm2;
        return fn;
        
      }

      //  WAF TO check an array is sorted or not!
      public static boolean isSorted_array(int arr[]){
        //Base Case!
        if(arr.length == 0 || arr.length == 1){
            return true;
        }
        // logic !
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] <= arr[i+1]){
                return true;
            }
            else{
                return false;
            }

        }
        // return isSorted_array(arr[i]+arr[i+1]);
        return isSorted_array(arr);
      }
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // System.out.print("Enter your number: ");
        // int n=sc.nextInt();
    //    // int n=5;
    //     System.out.print("decreasing order of "+n+"is:");
    //     print_n_dec(n);
    //     System.out.println();
    //    // System.out.print("increasing order of "+n+"is:");
    //     print_n_incre(n);
    //     System.out.println();
    //     System.out.print("factorial of your number is:");
    //     System.out.print(print_n_fact(n));
    //     System.out.println();
    //     System.out.print("sum of number:");
    //     System.out.println(print_sum(n));
        // System.out.println();
        // System.out.print("fabonacci of your number is:"+print_fab(n));
        int arr[]={1,2,0,9,3};
        System.out.println(isSorted_array(arr));

    }
    
}

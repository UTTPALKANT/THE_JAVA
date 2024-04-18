package Practice;
 

// Qs...-> print number in increasing order and decreasing order
public class numINcre {
    //function
    public static void printIncre(int n){
        //base case
        if(n==1){
            System.out.print(1+" ");
            return ;
        }
        printIncre(n-1);
        System.out.print(n+" ");
       
    }
    // definr function to print number in decreasing order
    public static void printDEc(int n){
        //Base case
        if(n==1){
            System.out.print(" "+ 1);
            return ;
        }
        System.out.print(" "+n);
        printDEc(n-1);
    }

    // factorial of n
    public static int fact(int n){
        //base case of factorial
        if(n==0){
            return 1;
        }
        int fnm1=fact(n-1);//self define krna hota hain
        int fn= n*(fact(n-1));//as it is logic
        return fn;
    }
    //sum of n natural number
    public static int sumN(int n){
        //Base case 1!
        if(n== 1){
            return 1;

        }
        int sum1=sumN(n-1);
        int sum=n+sumN(n-1);
        return sum;
    } 
    //subtraction of n natural number
    public static int subN(int n){
        if(n==0){
            return 0 ;
        }
        int subnm1= subN(n-1);
        int sub=n-(subN(n-1));
        return sub;
    }
    public static void main(String[] args) {
        int n=5;
        
        System.out.print(" it is in increasing order: ");
        printIncre(n);
        System.out.println();
        System.out.print( "it is in decreasing order: ");
        printDEc(n);
        System.out.println();
        System.out.print("fact of number "+n+" is: "+fact(n));
        System.out.println();
        System.out.print("Sum of "+n+" is: "+sumN(n));
        System.out.println();
        System.out.print("Subtraction of "+n+" is:"+ subN(n));
        


    }
}

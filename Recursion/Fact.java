package Recursion;

public class Fact {
    public static int fact(int num){
        if(num==0){// here base case is 0 (fact of 0! = 1).
            return 1;
        }
        int fnm1= fact(num-1);// fact of num - 1 i.(fact(num-1)!)
        int fn= num*fact(num-1);//fact of num
        return fn;   
    }
    public static void main(String[] args) {
        int num=5;
      System.out.println(  fact(num));
    }
}

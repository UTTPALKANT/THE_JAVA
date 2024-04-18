package Backtracking;

public class Permutation {
    //WAF for find permutation!
    public static void findPermutation(String str, String ans){

        //base case!
        if( str.length() == 0){
        System.out.println(ans);
        return;
        }
        // logic for recursion !
        for(int i= 0; i<str.length();i++){
            char curr = str.charAt(i);
            //"abcde" => "ab"+"de" ="abde";
            String NewStr=str.substring(0, i)+str.substring(i+1); // here substring used via inbluilt!
            findPermutation(NewStr, ans+curr);// this line define the back tracking!
        }
    }
   
    public static void main(String[] args) {
        String str= "abc";
        findPermutation(str, "");
    }
}

package String;

public class Palindrome {
    //Function to get palindrome
    public static boolean isPalindrome(String str){
        for(int i=0;i<str.length()/2;i++){ // time complexcity is O(n)!
            int n= str.length();
            if(str.charAt(i) != str.charAt(n-1-i) ){
            
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        //String str ="racecar";// true output dega 
        String str ="racecar";// true output dega dos't not effect by smallm ..or..capital letter
       System.out.println( isPalindrome(str));
    }
}

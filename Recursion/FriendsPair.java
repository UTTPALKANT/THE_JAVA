package Recursion;

public class FriendsPair {
    public static int posibleFriendsPair(int n){
        //Base case!
        if(n==1 || n==2){
            return n;
        }
        //kaam !!
        int fnm1 =posibleFriendsPair( n-1);
        int fnm2 =posibleFriendsPair(n-2);
        //total ways of pairing!!
        int totalWays =fnm1+fnm2;
        return totalWays;
    }
    public static void main(String[] args) {
       System.out.println( "posibleFriendsPair maybe "+posibleFriendsPair(2));
    }
}

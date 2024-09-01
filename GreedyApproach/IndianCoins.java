package GreedyApproach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class IndianCoins {
    public static void main(String[] args) {
        Integer coins[]={1,2,5,10,20,50,100,500,2000};
        int countOfcoins=0;
        Arrays.sort(coins,Comparator.reverseOrder());
        int amount=590;//given
        ArrayList<Integer> ans=new ArrayList<>(); // for add coins as ans

        for(int i=0;i<coins.length;i++){
            if(amount>=coins[i]){
                while (amount >=coins[i]) {
                    countOfcoins++;
                    ans.add(coins[i]);
                    amount -=coins[i];
                }
            }
        }
        System.out.println("total (minimum) coins use= "+countOfcoins);
        //if want kitna coins  used
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
  }
}

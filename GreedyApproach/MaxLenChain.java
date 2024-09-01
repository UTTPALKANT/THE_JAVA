package GreedyApproach;

import java.util.*;
import java.util.Arrays;

public class MaxLenChain {
    public static void main(String[] args) {
        int pairs[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};
        int chainLen=1;// as ans
        int chainEnd=pairs[0][1];
        // now pair ko sorting
        Arrays.sort(pairs,Comparator.comparing(o->o[1]));

        //loop
        for(int i=0;i<pairs.length;i++){
            if(pairs[i][0]>chainEnd){
                chainLen++;
                chainEnd=pairs[i][1];//update
            }
        }
            System.out.println(" Max ChainLegth is:"+chainLen);
    }
}

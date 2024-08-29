package GreedyApproach;

import java.util.*;
import java.util.Arrays;

public class FractionalKnapS {
    public static void main(String[] args) {
      int val[]={60,100,120};
      int weight[]={10,20,30};
      int w=50;

      double ratio[][]=new double[val.length][2];
      for(int i=0;i<val.length;i++){
        ratio[i][0]=i;
        ratio[i][1]=val[i]/(double)weight[i];
      }
      //store in acscending use lamda
      Arrays.sort(ratio,Comparator.comparing(o->o[1]));

      //analyse frome reverse
      int capacity=w;
      int finalVal=0;
      for(int i=ratio.length-1;i>=0;i--){
        int index=(int)ratio[i][0];
        if(capacity>=weight[index]){
            finalVal +=val[index];
            capacity -=weight[index];
        }
        else{
            finalVal +=(ratio[i][1]*capacity);
            capacity=0;
            break;
        }
      }
      System.out.println("final value is:"+finalVal);
    }
}

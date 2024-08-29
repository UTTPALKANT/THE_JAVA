package GreedyApproach;

import java.util.Arrays;
import java.util.*;

public class AbsoluteDiff {
   public static void main(String[] args) {
    int A[]={4,1,8,7};
    int B[]={2,3,6,5};
    int minDiff=0;

    // Sort both arrays
    Arrays.sort(A);
    Arrays.sort(B);

    for(int i=0;i<A.length;i++){
  minDiff +=Math.abs(A[i]-B[i]);
    }
    System.out.println("Absolute value is:"+minDiff);
   }
}

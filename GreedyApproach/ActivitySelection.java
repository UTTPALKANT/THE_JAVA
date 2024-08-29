package GreedyApproach;
import java.util.ArrayList;
public class ActivitySelection {
    public static void main(String[] args) {
        int start[]={1,3,0,5,8,5};
        int end[]={4,6,7,9,9};
        ArrayList<Integer> ans=new ArrayList<>();
        int maxtActivity=1;
        int lastEnd=end[0];
        ans.add(0);

        for(int i=0;i<end.length;i++){
            if(start[i]>=lastEnd){
                maxtActivity++;
                ans.add(i);
                lastEnd=end[i];

            }
        }
        System.out.println("Max Activity = "+maxtActivity);
        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }

System.out.println();
        
    }
}

package GreedyApproach;
import java.util.ArrayList;
public class practice {
    public static void main(String[] args) {
        // Activity Selection
        int start[]={1,3,4,5,6,8};
        int end[]={2,4,6,8,9,9};

        ArrayList<Integer> ans=new ArrayList<>();
        
        //take three variable
        int maxAct=1; // first activity!
        int lastEnd=end[0];
        ans.add(0);

        for(int i=0;i<end.length;i++){
            if(start[i]>=lastEnd){
                maxAct++;
                ans.add(i);
                lastEnd=end[i];
            }
        }
        System.out.println("max Activity=  " +maxAct);
        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();

        
    }
}

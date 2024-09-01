package ArrayList;
import java.util.*;
public class WaterCon {
    //Broutforce function to print maxWater!
    public static int maxWaterContain(ArrayList<Integer> height){
        int maxWater=0;
        for(int i=0;i<height.size();i++){
            for(int j=1+1;j<height.size();j++){
                int ht=Math.min(height.get(i),height.get(j));
                int width=j-i;
                int currentWater=ht*width;
                maxWater=Math.max(maxWater, currentWater);
            }
        }
        return maxWater;
    }

    //**time complexity i.e linear O(n) */


    // 2 pointer approch
    public static int storeWater(ArrayList<Integer> height){
        int maxWater2=0;
        
        int lp=0;
        int rp=height.size()-1;

    while (lp<rp) {
        //calculate
        int ht2=0;
        int width2=rp-lp;
        ht2=Math.min(height.get(lp),height.get(rp));
        int currentWater2= ht2*width2;
        maxWater2= Math.max(maxWater2, currentWater2);


        //update water!
         if(lp<rp){
            lp++;
            
         }else{
            rp--;
         }
    }
    return maxWater2;
    }
    
    
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<Integer>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        // System.out.println(height);
        System.out.println("****Brout Force****");
        System.out.println(maxWaterContain(height));
        System.out.println("******************2 pointer approch****");
        System.out.println(storeWater(height));

    }
}

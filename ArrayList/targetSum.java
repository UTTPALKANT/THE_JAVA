package ArrayList;
import java.util.ArrayList;
public class targetSum{
    public static void main(String[] args) {
        //simple way to print sunGroup to get 5 after sum;
        int targetSum=5;
       for(int i=1;i<=6;i++){
        for(int j=i+1;j<=6;j++){
            if(i+j == 5){
                System.out.println(i+","+j);
            }
        }
       }
       //via ArrayList!
       ArrayList<Integer> List =new ArrayList<>();
       List.add(1);
       List.add(2);
       List.add(3);
       List.add(4);
       List.add(5);
       List.add(6);
       System.out.println(List);
       System.out.println(List.size());
       for(int i=0;i<List.size();i++){
        for(int j =i+1;j<List.size();j++){
            if(List.get(i)+List.get(j) == targetSum){
                System.out.println(List.get(i)+","+List.get(j));
             
            }
        }
       }

    }
}
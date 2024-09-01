package ArrayList;
import java.util.ArrayList;
public class Target_num {
    public static boolean getTarget(ArrayList<Integer> list ,int target_elmt){
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)+list.get(j) == target_elmt){
                    return true;
                }
                else{return false;}
            }
        }
        return true;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //we have sorted array 1,2,3,4,5,6;
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target_elmt=5;
        //System.out.println(list);
System.out.println(getTarget(list, target_elmt));
    }
}

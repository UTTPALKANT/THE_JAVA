package THE_JAVA;

public class PairSum {
    public static void main(String[] args) {
        int[] arr = {8,9,2,3,4,1};
        for(int i=0; i<arr.length-2;i++){
            for(int j=i;j<arr.length-1;j++){
                System.out.println(arr[i]+arr[i+1]);
                i +=2;
            }

        }
    }
}

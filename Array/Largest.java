package Array;

public class Largest {
public static void main(String[] args) {
    int numbers[]={1,8,9,3,7,2,6,45,8};
    int largestNum=Integer.MIN_VALUE;
    for(int i=0;i<numbers.length;i++){
        if(numbers[i] >largestNum){
            System.out.println(numbers[i]);
        }
        else{
            largestNum=numbers[i];
            numbers[i]++;
        }
    }

}
}

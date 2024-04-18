package String;

public class CompareTo {
    public static void main(String[] args) {
        String fruits[]={"Apple","mango","banana","q"};
        String largeString= fruits[0];
        for(int i=0;i<fruits.length;i++){
            if(largeString.compareTo(fruits[i])<0){
                largeString=fruits[i];
            }
        }
        System.out.println("your largest string is: "+largeString);
    }
}
// time complexiti is O(n)
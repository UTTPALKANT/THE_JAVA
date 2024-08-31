package THE_JAVA;

public class fzctorial {
    public static void main(String[] args) {
       int n=5;
       int fact=1;
    for(int i=n;i>0;i--){
         fact *= n;
         n--;
        }
        System.out.println(fact);
}
   }

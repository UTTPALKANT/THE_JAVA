package Practice;

public class recu {
    public static void printDecreased_value(int n){
        //base of its( n value) i.e 
        if(n == 1){
            System.out.println(1); //mean n ka value base thak reached krta hai to return kr do
            return;
        }
        System.out.print(n+" ");//actual value
        printDecreased_value(n-1); //recursively calling of its smaller instance value

    }
    public static void main(String[] args) {
        int n= 10;
        printDecreased_value(n);

    }
}

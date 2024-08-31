package THE_JAVA;

public class Swapping {
    public static void factorial(int number)
    {
        number =5;
        int fact= 1;
        for(int i=5;i<=number;i--){
            fact *=number;
            fact--;
        }
        System.out.println(fact);
    }
    public static void main(String[] args) {
        int a=85;
        int b=8;
        // a=a^b;
        // b=a^b;
        // a=a^b;
        a=a-b;
        b=a+b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);
        Swapping.factorial(5);
    }
}

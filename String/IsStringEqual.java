package String;

public class IsStringEqual {
    public static void main(String[] args) {
        String s1="Uttpal";
        String s2="Uttpal";
        String s3= new String("Uttpal");
        // if(s1==s2){
        //     System.out.println("String s1&s2 are  equal:");
        // }
        // else if(s1==s3){
        //     System.out.println("String s1&s3 are equal! ");  // not equal kyu ki new keyword s ek neya objecT Ban gya
        // }
        // else{
        //     System.out.println("String are not equal!");
        // }
        
        if (s1.equals(s3)){
            System.out.println(" s1&s3 are equal");
        }
    }
}

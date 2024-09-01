package String;

public class Vowel {
    public static void main(String[] args) {
        int count=0;
        String s1="";
        String s="I am uttpal kant from patepur";
        //String toString;
        for(int i=0;i<s.length();i++){
           char ch =s.charAt(i);
           if(ch == 'a' || ch == 'e' || ch== 'i' || ch== 'o' ||ch == 'u' || ch == 'A' || ch == 'E' || ch== 'I' || ch== 'O' ||ch == 'U'){
           //System.out.print(ch);
           s1 +=ch;
            count++;
        }
        //System.out.print(ch);

    }System.out.println(s1);
  
    System.out.println(count);
        
    }
}

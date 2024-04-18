package String;
// Qs to convert each first letter of word into upperCase
public class UpperCase {
    public static String toCnvertUpCase(String str){
        StringBuilder sb = new StringBuilder("");
        char ch =Character.toUpperCase(str.charAt(0));//  line  6 and 7 state that first letter mean first word letter change into upper case
        sb.append(ch);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));// this line convert into Upper case
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        //String str ="i am good boy";
        String str ="my name is uttpal kant";
        System.out.println(toCnvertUpCase(str));
    }
}

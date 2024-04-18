package String;

public class CharAt {
          //finding the position of charater  ..or.. print ith(we can print single character!) index value from string
        public static void searchChar(String name){
             for(int i =0;i<name.length();i++){
                System.out.print(name.charAt(i)+" ");
             }
             System.out.println();
        }
    public static void main(String[] args) {
        String name="uttpal";
        searchChar(name);
        System.out.println(name.charAt(1)); // for print ssingle char from string then use only this otherWise use loop!!!
    }
}

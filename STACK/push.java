package STACK;

import java.util.Stack;

public class push {
    // Function push
    public static void pushElement(String s , Integer n){
       

    }

    public static void main(String[] args) {
        Stack s =new Stack<>();
        Stack n =new Stack<>();
        for(int i=0;i<=10;i++){
            s.push(i);
        }
        System.out.println("** For string ");
        for(char  c='a';c<='e';c++){
            n.push(c);
        }
        System.out.println(s);
        //System.out.println(s.clear());
        // s.clear();
        // System.out.println("Clear "+s);
        s.remove(5);
        System.out.println(s);
        
    }
}

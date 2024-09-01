package STACK;
import java.util.*;
public class Itro {
    public static void main(String[] args) {
        Stack<Integer> st =new Stack<>();
        Stack stk = new Stack<>();
        Stack<String> st2 =new Stack<>();// this is empty stakc 
        Stack<String> st3 =new Stack<>();
        
        st.push(1);
        st.push(7);
        st.push(5);
        st.push(8);
        st2.push(" ");
        st.push(6);
        st.push(02);
        st.push(91);
        st.add(4);
        //************** */
       
        
       
        System.out.println(st);        
        System.out.println("***method uses****");
        System.out.println(st.capacity());

        st.peek();// this will not return anything!!
        System.out.println(st.peek());// this will return the top element of the stack! /* don't confuse it follow lifo techniquse */
        System.out.println(st.isEmpty());//
        System.out.println(st2.isEmpty());
        System.out.println("* SEARCH ELEMENT***");System.out.println(st.search(5)); //IT RETURN THE INDEX OF PARTICULAR INDEX OF ELEMENT
        System.out.println(st.push(55));
        System.out.println(st2);
        System.out.println(st3.isEmpty());
        System.out.println("Uttpal"+st);
        System.out.println("** size of stack st**");
        System.out.println(st.size());
        System.out.println(st.contains(5));// if is it in stack then return true otherwise false!
        System.out.println(st.capacity());
      //  System.out.println(st.length()); // length is not in stack

      System.out.println("******stk****");
      stk.push (1+4+5);// it will add (i.e 10) and then push into the stack
      stk.push(10);// stack can store doublicate element!
      stk.push(10);
      stk.push(1);
      stk.push(7);
      stk.push(5);
      stk.push(8);
      stk.push("Uttpal"+" ,Rohan");
      stk.push(st);
      stk.push("V4U");
      System.out.println(stk);
        //**** ******** */
      System.out.println("****** reverse ***");
      Stack stk2 =new Stack<>();
      stk2.push("Uttpal");
      stk2.push("vinay");
      stk2.push("Dinnay");
      //skt2.pop();
      System.out.println(stk2.pop());//Dinnay pop hog i.e delete Dinnay joki Dinnay top pe hai!
      System.out.println(stk2);
      for(int i=0;i<stk2.size();i++){
      
      }
      
    }
}

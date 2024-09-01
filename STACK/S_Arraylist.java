package STACK;

import java.util.ArrayList;

public class S_Arraylist {

    public static class Stack {
       static  ArrayList<Integer> list = new ArrayList<>();
        //isEmpty
        public static  boolean isEmpty(){
            return list.size()==0;
        }
        //push
        public static void push(int data)
        {
            list.add(data);
        }
        //pop
        public static int pop(int data){
            if(isEmpty()){
                return -1;
            }
            int top =list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        } 
        //peek
        public static int peek(int data){
            if(isEmpty()){
                return -1;
            }
            int top=list.get(list.size()-1);
            return top;
        }

    }
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.peek(0);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        while(!s.isEmpty()){
            System.out.println(s.peek(0));
            s.pop(0);
        }// output 6 5 4 3 2 1

    }
}

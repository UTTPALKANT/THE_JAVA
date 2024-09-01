package STACK;

public class S_LL {

    public static class Node 
    {
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next =null;
        }
    }

    static class Stack 
    {
        static Node head =null;
        public static boolean isEmpty(){
            return head==null;
        }

        //push
        public static void push(int data )
        {
            Node newNode=new Node(data);
            if(isEmpty()){
                return ;
            }
            newNode.next=head;
            head=newNode;

        }
        //pop
        public static int  pop(int data){
           int top = head.data;
           head=head.next;
           return top;
        }
        //peek
        public static int peek(int data){
            return head.data;
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

package LiList;

public class isPalindrom {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public void add_first(int data){
        Node newNode=new Node(data);
        if(head == null){
           head=tail=newNode;
        }
       
        newNode.next=head;
        head=newNode;
    }
    //print LL
    
    public static void main(String[] args) {
        
    }
}

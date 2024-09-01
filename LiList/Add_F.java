package LiList;

public class Add_F {
    public static class Node
    {
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public void addFirst(int data){
        //(1)_create new Node
        //(2)_newNode's next store head
        //(3)_ head m new Node
        Node newNode=new Node(data);
        if(head == null)
        {
            head =tail=newNode;
            return;
        }// 1 complete
        newNode.next=head; // mean new Node's next now point to the pre head;
        head=newNode; //now our new Node is head...
    }
    public void print(){
        Node temp=head;
        if(head == null){
            System.out.println("linked list is empty");
            return;
        }
        while(temp !=null){
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Add_F list=new Add_F();
        System.out.println("*** Add first effect ***");
        list.print();
        list.addFirst(10);
        list.addFirst(9);  
        list.addFirst(8);
        list.addFirst(7);
        list.print();      
        




    }
}

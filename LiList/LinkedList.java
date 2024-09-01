package LiList;

public class LinkedList {
    //Node class
    public static class Node{
        int data;
        Node next;
        public Node(int date){
            this.data = data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;

    //methode to performe addFirst and addLast
    public void addFirst(int data){
        Node newNode =new Node(data);
        if(head == null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void print() {
        if (head == null) {
            System.out.println("LinkedList is Empty!");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LinkedList ll= new LinkedList();
        AddFirst1 ll1 = new AddFirst1();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);

        ll1.printList();
        ll1.addFirst(2);
        ll1.addFirst(1);
        ll.print();
    
    }
}

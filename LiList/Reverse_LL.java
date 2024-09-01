package LiList;
import java.util.LinkedList;
public class Reverse_LL {

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

     // Method for adding a node at the beginning
     public void addFirst(int data) {
        // Step 1: Create a new node
        Node newNode = new Node(data);
        
        if (head == null) {
            // If the list is empty, both head and tail will point to the new node
            head = tail = newNode;
            return;
        }

        // Step 2: newNode.next = head
        newNode.next = head;

        // Step 3: head = newNode
        head = newNode;
    }

    // Method to print the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // reverse the LL list
    public void reverse(){
        // initiate three variable 1-> Prev, 2->curr, 3-> next:
        Node prev=null;
        Node curr=tail=head;
        Node next;

        while(curr != null){//here 4 step to be perform!
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;

        }
        head=prev;
    }
    
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();
        Reverse_LL rell=new Reverse_LL();
        rell.addFirst(5);
        rell.addFirst(4);
        rell.addFirst(3);
        rell.addFirst(2);
        rell.addFirst(1);

        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
       
        System.out.println(ll);
        rell.printList();
        System.out.println("*** After reverse linked list *********");
        rell.reverse();
        rell.printList();
    
       // System.out.println(ll.reverse());
        
        
    }
}

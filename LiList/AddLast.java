package LiList;
import java.util.LinkedList;
public class AddLast {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Initialize head & tail
    public static Node head ;
    public static Node tail ;
    public static int size;

     // Method for adding a node at the beginning
     public void addFirst(int data) {
        // Step 1: Create a new node
        Node newNode = new Node(data);
        size++;
        
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


    // Method for adding at the last
    public void addLast(int data) {
        // Step 1: Create a new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Step 2: Assign tail.next = newNode
        tail.next = newNode;
        tail = newNode;
    }

    // Method to print LinkedList
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
    // remove the node from linked list
    //method
    public int removeFirst()
    {
        // for base case
        if(size == 0)
        {
            System.out.println("linked List is empty");
            size=0;
        }
        else if(size == 1)
        {
            head =tail= null;
            size=0;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }


    // method for Search iterative
    public int itrSearch(int key)
    {
        Node temp=head;
        int i=0;
        while (temp!=null) {
            if(key == i)
            {
                return i;
            }
            temp =temp.next;
            i++;
        }
        return -i;
    }

    //method to perform removeFirst
    public int remove_First(){
        if(size == 0){
            System.out.println("LL is empty");
            size=0;
        }else if(size == 1){
            int val =head.data;
            head=tail=null;
            size=0;

            return val;
        }
        int val =head.data;
        head=head.next;
        size--;
        return val;

    }
    //method for Recursive Search
    public int helper(Node head, int key){
        if(head == null){//base case
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int index=helper(head.next, key);
        if(index == -1){
            return -1;
        }
        return index+1;
    }
    public int recSearch(int key){
        return helper(head, key);
    }
    public static void main(String[] args) {
        LinkedList<Integer> ll1 =new LinkedList<>();
        ll1.size();
        //ll1.print(); //this will not print becaz print method create for AddLast;;;d
        AddLast ll = new AddLast(); // Corrected initialization of the linked list
        ll.print();
        ll.addLast(9);
        ll.print();
        ll.addLast(2);
        ll.print();
        ll.addLast(3);
        ll.print();
        System.out.println("size of a LinkrdList "+ll.size);
        ll.removeFirst();
        ll.print();
        System.out.println("size of a LinkrdList "+ll.size);
        System.out.println("************** itirative search *********");
        System.out.println(ll.itrSearch(1));
        System.out.println(ll.itrSearch(10));
        System.out.println(ll.remove_First());
        System.out.println("************** recursive search *********");
        System.out.println(ll.recSearch(1));
        System.out.println(ll.recSearch(10));
       ll.print();
    }
}

package LiList;

public class AddFirst1 {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head ;
    public static Node tail ;

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

    public static void main(String[] args) {
        AddFirst1 ll = new AddFirst1();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);

        ll.printList();
    }
}

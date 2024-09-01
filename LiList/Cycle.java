package LiList;

public class Cycle {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head ;
    public static Node tail;
    public static boolean isCycle() // fcfa
    {
        Node slow = head;
        Node fast = head; //stating mai slow and fast head k pass hi rahega
        while(fast != null && fast.next != null){
            slow = slow.next; // +1
            fast = fast.next.next; // +2
            if(slow == fast)
            {
            return true; // that mean cycle exist
            }
        }
        return false;
    }
    public static void main(String[] args) {
        head =new Node(1);
        head.next = new Node(2);
        head.next.next= new Node(3);
        head.next.next.next= new Node(4);
        //head.next.next.next.next= head; //due to this statement our list is cycle
        System.out.println(isCycle());
    }
}

package LiList;

public class RemoveCycle {
    public static class Node{
        int data;
        Node next;
        public Node (int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    // method for cycle
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
    // Remove cycle method
    public static void removeCy()
    {
        Node slow=head;
        Node fast =head;
        boolean cycle =false;
        //detect loop/cycle
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(fast== slow)
            {
                cycle =true;
                break; //as finding loop Linked list get stop traversing and jump to next block of code
            }
        }
        if(cycle==false)
        {
            return;
        }
        //as finding loop 
        slow=head;
        Node lastNode =null;
        while(slow !=fast){
            lastNode =fast;
            slow=slow.next;
            fast=fast.next;
        }
        lastNode.next=null;
    }
    public static void main(String[] args) {
        head =new Node(1);
        Node temp=new Node(2);
        head.next=temp;
        head.next.next=new Node(3);
        head.next.next.next=temp;
        System.out.println(isCycle());
        removeCy();
        System.out.println(isCycle());
    }
}

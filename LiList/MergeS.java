package LiList;

public class MergeS {
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

    //merge sort on linked list

    //step 1st  finding mid
     Node getMid(Node head)
    {
        Node slow=head;
        Node fast=head.next;
        while (fast !=null && fast.next!= null) {
            slow =slow.next;
            fast=fast.next.next;
        }
        return slow; //it will going to get mid
    }

    //merge function
    private Node merge(Node head1, Node head2)
    {
        Node merged =new Node(-1);
        Node temp= merged;
        while (head1!=null && head2!=null) {
            if (head1.data<=head2.data) {
                temp.next=head1;
                head1=head1.next;
            }
            else{
                temp.next=head2;
                head2=temp.next;
                temp=temp.next;
            }
        }
        while (head1!=null) {
            temp.next=head1;
            head1=temp.next;
            temp=temp.next;
        }
        while (head2!=null) {
            temp.next=head1;
            head2=temp.next;
            temp=temp.next;
        }
            return merged.next;
    }
    // public Node mergeSort(Node head)
    // {   
    //     /*let derived base case */
    //     if(head == null || head.next ==null) //base case!
    //     {
    //         return head;
    //     }
        // //to find mid!
        // Node mid =getMid(); //getMid will fetch from getMid method
        // //left && right Merge Sort!
        // Node rightHead= mid.next;
        // mid.next=null;
        // Node newLeftNode =mergeSort(head);
        // Node newRightNode =mergeSort(rightHead);
        // //merge
        // return merge(newLeftNode, newRightNode); //it will fetch from merge method
    //}
    public static void main(String[] args) {
        MergeS list=new MergeS();
        list.print();
        System.out.println("*** Add first effect ***");
        list.addFirst(10);
        list.addFirst(9);  
        list.addFirst(82);
        list.addFirst(1);
        list.addFirst(8);
        list.addFirst(7);
        list.print();      
        // list.head=list.mergeSort(list.head);
        list.print();
        
    }
}


    


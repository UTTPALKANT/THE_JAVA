public class Zig_ZagList {

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
    public void addfirst(int data){ //add fist method
        Node newNode=new Node(data);
        if(head ==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void print(){
        Node temp =head;
        if(head == null){
            System.out.println("list is empty!");
            return;
        }
        while( temp != null){
            System.out.print(temp.data+"->");
            temp =temp.next;
        }
        System.out.println("null");
    }
    // Approch to print Zig-Zag list!
    public void zig_zag(){
        //to get mid
        Node slow=head;
        Node fast=head.next;
        while(fast != null && fast.next !=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node mid=slow;

        //reverse! next 2nd half
       Node curr=mid.next;
       Node prev=null;
       Node next;
       mid.next=null;
       while( curr !=null){
        next =curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
       }

//********    zig-zag      *******  */
       Node leftHead=head;
       Node rightHead=prev; //Q ki prev null hai to take null i.e prev
       Node nextLeft,nextRight;
       while(leftHead != null && rightHead!= null){
        //zig-zag
        nextLeft=leftHead.next;
        leftHead.next=rightHead;
        nextRight=rightHead.next;
        rightHead.next=nextLeft;
        //update
        leftHead=nextLeft;
        rightHead=nextRight;
       }

    }
        public static void main(String[] args) {
        Zig_ZagList list= new Zig_ZagList();
        list.addfirst(5);
        list.addfirst(4);
        list.addfirst(3);
        list.addfirst(2);
        list.addfirst(1);
        list.print();
        list.zig_zag();
        list.print();
    
     
    }
}

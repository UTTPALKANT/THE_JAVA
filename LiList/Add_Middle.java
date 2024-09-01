package LiList;
import java.util.LinkedList;
public class Add_Middle

{
    public static class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void add_First(int data)
    {
        Node newNode= new Node(data);
        size++;
        newNode.next=head;
        head=newNode;
    }

    public void add(int index, int data)
    {
        Node newNode=new Node( data);
        size++;
        Node temp=head;
        int i=0;
        while(i<index-1)
        {
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public void print()
    {
        Node temp =head ;
        if(head == null)
        {
            System.out.println("Linked list is empty");
        }
        while(temp!=null)
        {
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    //
    public static void main(String[] args) 
    {
        LinkedList2 ll=new LinkedList2();
        LinkedList<Integer> list=new LinkedList<>();
        System.out.println("***** by creating specific method *************");
        ll.print();
        ll.add_First(3);
        ll.print();
        ll.add_First(35);
        ll.print();
        ll.add_First(2);
        ll.print();
        ll.add_First(1);
        ll.print();
        ll.add_First(1);
        ll.print();
        ll.print();
        ll.add(2, 81);
        ll.add(3, 71);
       
        ll.print();
        System.out.println("************ simple linked list ****************");
        list.add(4);
        list.addFirst(1);
        list.addLast(5);
        list.add(1,3);
        System.out.println(list);
        

    }
}
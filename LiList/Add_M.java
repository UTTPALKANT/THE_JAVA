package LiList;

public class Add_M {
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

    //method to add element in mid
    //create new Node;
    // let temp variable to store head
    // let anoter variable for iteration;
    // loop
    // now pointing the next 
    public void addMid(int index,int data){
        Node newNode = new Node(data);
        if(head == null){
            head=tail=newNode;
            return;
        }
        // 2nd Step
        Node temp=head;
        int i=0;
        while(i< index-1){
            temp=temp.next;//mean now temp starting pointing to next node to print
            i++;
        }
        newNode.next =temp.next;// mean new node k next m temp k next store hogya
        temp.next=newNode;    // 
    }
    public void add_Last(int data){//add last method
        //(1)_create new Node
        //(2)_newNode's next store tail
        //(3)_ tail m new Node
        Node newNode=new Node(data);
        if(head == null)
        {
            head =tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public static void main(String[] args) {
        Add_M list=new Add_M();
        System.out.println("*** Add first effect ***");
        list.print();
        list.addFirst(10);
        list.addFirst(9);  
        list.addFirst(8);
        list.addFirst(7);
        list.print(); 
        System.out.println("*** Add in mid effect ***");
        list.addMid(2, 55);
        list.addMid(3, 56);
        list.print();
        System.out.println("*** Add last effect ***");
        list.addFirst(4);
        list.add_Last(1);
        list.add_Last(2);
        list.add_Last(3);
        list.print();
   
    }
}
